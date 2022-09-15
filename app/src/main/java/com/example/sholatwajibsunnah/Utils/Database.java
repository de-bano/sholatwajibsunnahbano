package com.example.sholatwajibsunnah.Utils;

import java.util.List;

public interface Database {
    public List<Object> select(String queryString);

    public int insert(String tableName, Object Content);

    boolean update(String tableName, Object Content);

    boolean delete(String tableName, int id);

    boolean execute(String queryString);
}
