package com.example.sholatwajibsunnah.Controllers;

import android.content.ContentValues;

import com.example.sholatwajibsunnah.Utils.Database;
import com.example.sholatwajibsunnah.Utils.DBContents;

import java.util.List;

public class UserControllers {

    private UserControllers() {}
    private static Database database;
    private static UserControllers instance;


    public static UserControllers getInstance() {
        if (instance == null)
            instance = new UserControllers();

        return instance;
    }

    /**
     * Sets database for use in this class.
     * @param db database.
     */
    public static void setDatabase(Database db) {
        database = db;
    }

    public ContentValues getDataByUsername(String username) {
        String queryString = "SELECT * FROM " + DBContents.TABLE_DAFTARMASJID + " WHERE username = '"+ username +"'";
        List<Object> contents = database.select(queryString);

        if (contents.isEmpty()) {
            return null;
        }

        ContentValues content = (ContentValues) contents.get(0);
        return content;
    }

    public ContentValues getDataById(int id) {
        String queryString = "SELECT * FROM " + DBContents.TABLE_DAFTARMASJID + " WHERE _id = '"+ id +"'";
        List<Object> contents = database.select(queryString);

        if (contents.isEmpty()) {
            return null;
        }

        ContentValues content = (ContentValues) contents.get(0);
        return content;
    }

    public Object getUsers() {
        List<Object> contents = database.select("SELECT * FROM " + DBContents.TABLE_DAFTARMASJID);

        return contents;
    }

    public int register(ContentValues content) {
        int id = database.insert(DBContents.TABLE_DAFTARMASJID.toString(), content);

        return id;
    }

    public boolean update(ContentValues content) {
        boolean update = database.update(DBContents.TABLE_DAFTARMASJID.toString(), content);

        return update;
    }
}

