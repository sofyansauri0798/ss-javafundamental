package com.juaracoding;



/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 31/08/2024 08:13
@Last Modified 31/08/2024 08:13
Version 1.0
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String URL = "jdbc:sqlite:mydatabase.db"; // Nama file database SQLite

    public static void main(String[] args) {
        try {
            // Create a new database and table
            createNewDatabase();
            createTable();

            // Insert data
            insertData("John Doe", 30);
            insertData("Jane Smith", 25);

            // Update data
            updateData(1, "John Doe Updated", 31);

            // Delete data
            deleteData(2);

            // Display data
            displayData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Create a new database file
    private static void createNewDatabase() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("Database created successfully.");
            }
        }
    }

    // Create a new table
    private static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, age INTEGER NOT NULL)";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully.");
        }
    }

    // Insert data into the table
    private static void insertData(String name, int age) throws SQLException {
        String sql = "INSERT INTO users(name, age) VALUES(?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        }
    }

    // Update data in the table
    private static void updateData(int id, String name, int age) throws SQLException {
        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Data updated successfully.");
        }
    }

    // Delete data from the table
    private static void deleteData(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Data deleted successfully.");
        }
    }

    // Display all data from the table
    private static void displayData() throws SQLException {
        String sql = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        }
    }
}

