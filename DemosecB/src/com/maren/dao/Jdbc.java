package com.maren.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from test.login");
			while(((ResultSet) rs).next()) {
				String us = ((ResultSet) rs).getString("user_id");
				String ps = ((ResultSet) rs).getString("password");
				String tp = ((ResultSet) rs).getString("type");
				System.out.println("\nUSERID:" +us+ "\nPASSWORD:" +ps+ "\nTYPE:" +tp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
}