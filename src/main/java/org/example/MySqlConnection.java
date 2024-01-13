package org.example;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MySqlConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("MySql Connection");
    }

    @Override
    public List<String> executeQuery(String query) {
        List<String> s =new ArrayList<>() ;
        s.add("M");
        s.add("Y");
        s.add("S");
        s.add("Q");
        s.add("L");
        s.add("-");
        s.add(query);
        return s;
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");;
    }
}
