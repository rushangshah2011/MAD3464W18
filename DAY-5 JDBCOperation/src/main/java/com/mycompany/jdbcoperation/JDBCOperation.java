package com.mycompany.jdbcoperation;

import java.sql.*;

/**
 *
 * @author 728464
 */
public class JDBCOperation {
    static Connection conn;
    static ResultSet rs;
    static String USER = "root";
    static String PASS = "";
    static PreparedStatement stmt;
    
    public static void main(String[] args) {
        connectDB();
        selectDB();
        insertDB();
    }
    
    static void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/madwinter18", USER, PASS);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    static void selectDB() {
        try {
            stmt = conn.prepareStatement("SELECT * FROM Person");
            //stmt.execute();
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                System.out.println(" ID : " + rs.getInt(1) + " First Name : " + rs.getString("firstname") + " Last Name : " + rs.getString("lastname") + " Age : " + rs.getInt("Age"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    static void insertDB() {
        try {
            stmt = conn.prepareStatement("insert into Person values(?,?,?,?)");
            stmt.setInt(1, 103);
            stmt.setString(2, "Abhishek");
            stmt.setString(3, "Patel");
            stmt.setInt(4, 21);

            
            int i = stmt.executeUpdate();
            System.out.println(i +" recors inserted");
       }catch(SQLException se) {
            se.printStackTrace();
        }
    }
    
}
