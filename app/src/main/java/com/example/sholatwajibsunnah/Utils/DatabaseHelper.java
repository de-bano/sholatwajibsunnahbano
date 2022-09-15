package com.example.sholatwajibsunnah.Utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper implements Database {
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = DBContents.DATABASE.toString();


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DBContents.TABLE_DAFTARMASJID + "("
                + "_id INTEGER PRIMARY KEY,"
                + "gambar TEXT(100),"
                + "namatempat TEXT(256),"
                + "alamattempat TEXT(256),"
                + "deskripsi TEXT(100),"
                + "clicktovisit TEXT(256)"
                + ");");

        Log.d("CREATE DATABASE", "Create " + DBContents.TABLE_DAFTARMASJID + " Successfully.");


        db.execSQL("CREATE TABLE " + DBContents.TABLE_DOAMASJID+ "("
                + "_id INTEGER PRIMARY KEY,"
                + "event_id INTEGER,"
                + "schedule_name TEXT(100),"
                + "status INTEGER DEFAULT 1,"
                + "start_date DATETIME,"
                + "end_date DATETIME,"
                + "allowed_tickets VARCHAR(100)"
                + ");");

        Log.d("CREATE DATABASE", "Create " + DBContents.TABLE_DOAMASJID+ " Successfully.");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DBContents.TABLE_DAFTARMASJID);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + DBContents.TABLE_DOAMASJID);
        onCreate(db);

    }

    @Override
    public List<Object> select(String queryString) {
        try {
            SQLiteDatabase database = this.getWritableDatabase();
            List<Object> list = new ArrayList<Object>();
            Cursor cursor = database.rawQuery(queryString, null);

            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        ContentValues content = new ContentValues();
                        String[] columnNames = cursor.getColumnNames();
                        for (String columnName : columnNames) {
                            content.put(columnName, cursor.getString(cursor
                                    .getColumnIndex(columnName)));
                        }
                        list.add(content);
                    } while (cursor.moveToNext());
                }
            }
            cursor.close();
            database.close();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int insert(String tableName, Object content) {

        try {
            SQLiteDatabase database = this.getWritableDatabase();

            int id = (int) database.insert(tableName, null,
                    (ContentValues) content);

            database.close();
            return id;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public boolean update(String tableName, Object content) {
        try {
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues cont = (ContentValues) content;
            // this array will always contains only one element.
            String[] array = new String[]{cont.get("_id")+""};
            database.update(tableName, cont, " _id = ?", array);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String tableName, int id) {
        try {
            SQLiteDatabase database = this.getWritableDatabase();
            database.delete(tableName, " _id = ?", new String[]{id+""});
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean execute(String queryString) {
        try{
            SQLiteDatabase database = this.getWritableDatabase();
            database.execSQL(queryString);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}

