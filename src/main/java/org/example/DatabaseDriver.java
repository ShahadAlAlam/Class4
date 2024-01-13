package org.example;

public class DatabaseDriver {


    public static DatabaseConnection getConnection(String user) {
        if(user=="Oracle"){
            OracleConnection oc=new OracleConnection();
            return oc;
        } else if (user=="MSQL") {
            MySqlConnection ms = new MySqlConnection();
            return ms;
        } else
            return null;
    }
}
