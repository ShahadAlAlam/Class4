package org.example;

import java.sql.Connection;
import java.util.List;

public interface DatabaseConnection {
    void connect();
    List<String> executeQuery(String query);
    void disconnect();
}
