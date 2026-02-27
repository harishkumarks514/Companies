package com.example.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ConnectionPoolExample {

    public static void main(String[] args) {

        // Step 1: Configure HikariCP
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/testdb");
        config.setUsername("root");
        config.setPassword("root");

        config.setMaximumPoolSize(10);   // Max connections
        config.setMinimumIdle(2);        // Min idle connections
        config.setIdleTimeout(30000);    // 30 sec
        config.setConnectionTimeout(20000); // 20 sec

        // Step 2: Create DataSource
        HikariDataSource dataSource = new HikariDataSource(config);

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 3: Close pool when application shuts down
        dataSource.close();
    }
}