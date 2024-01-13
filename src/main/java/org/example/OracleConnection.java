package org.example;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class OracleConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Oracle Conntection");
    }

    @Override
    public List<String> executeQuery(String query) {
        List<String> s =new ArrayList<>() ;
        s.add("O");
        s.add("R");
        s.add("A");
        s.add("C");
        s.add("L");
        s.add("E");
        s.add("-");
        s.add(query);
        return s;
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");;
    }
}
