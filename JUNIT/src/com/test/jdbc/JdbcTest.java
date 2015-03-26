package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		
		Connection conn;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?zeroDateTimeConversionBehavior=convertToNull", "root", "ChangeMe");
        PreparedStatement stmt = conn.prepareStatement("select * from user");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("Result -> " + rs.getString(1) + "--" + rs.getString(2) + "--" + rs.getString(3) +  "--" + rs.getString(4));
        }
        conn.close();

	}

}
