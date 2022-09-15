package com.example.sholatwajibsunnah.Utils;

public enum DBContents {

    DATABASE("db_masjidbogor.db"),
    TABLE_DAFTARMASJID("tbl_daftarmasjid"),
    TABLE_DOAMASJID("tbl_doamasjid");

    private String name;

    private DBContents(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
