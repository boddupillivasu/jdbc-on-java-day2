package com.customers.java;


import java.sql.*;

public class JdbcOnCustomers {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load or register the drive

        Class.forName("com.mysql.cj.jdbc.Driver");

        //Define connection url,username,password
        String url = "jdbc:mysql://localhost:3306/vasu";
        String user = "root";
        String password = "786786";

        //establish the connection between java program to database.
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println(con);

        //create statement object to execute insert query

        Statement stmtObj = con.createStatement();

        //execute the query
        String queryString = "insert into customer values (13,'vasu','andhra')";

        int r = stmtObj.executeUpdate(queryString);

        System.out.println("no of records inserted is : " + r);

        if (r > 0) {
            System.out.println("Row has been successfully inserted...!");
        }

        //close the objects

        stmtObj.close();
        con.close();
    }
}

