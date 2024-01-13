package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        String user = "Oracle";
        DatabaseDriver db = new DatabaseDriver();
        DatabaseConnection dbCon = db.getConnection(user);
        printData(dbCon,"db data");
    }

    public static void printData(DatabaseConnection db,String data){
        db.connect();
        System.out.println(db.executeQuery("query data").toString());
        db.disconnect();
    }
}