package com.iii.eeit94.LinCZ;

import java.sql.*;
import java.util.Calendar;

// Update employee data
public class UpdateDemo1 {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");
			
//			java.time.LocalDateTime today= new java.time.LocalDateTime();
			
			//Calendar obj
			Calendar today = Calendar.getInstance();//��getInstance()API����NEW
			today.set(Calendar.HOUR_OF_DAY, 0); // same for minutes and seconds
			
			String updStmt = "UPDATE employee SET salary=?, hiredate=? WHERE empno=?";
			PreparedStatement pstmt = conn.prepareStatement(updStmt);
			pstmt.setDouble(1, 58000);
			pstmt.setObject(2, today);
			pstmt.setInt(3, 1009);
			
			//SQL
//			String updStmt = "UPDATE employee SET salary=?, hiredate=GETDate() WHERE empno=?";
//			PreparedStatement pstmt = conn.prepareStatement(updStmt);
//			pstmt.setDouble(1, 58000);
//			pstmt.setInt(2, 1009);
			
			int num = pstmt.executeUpdate();
			System.out.println("update count = " + num);
			
			String qryStmt = "SELECT * FROM employee WHERE empno=?";
			pstmt = conn.prepareStatement(qryStmt);
			pstmt.setInt(1, 1009);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("name = " + rs.getString("ename") + ", ");
				System.out.println("salary = " + rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch(SQLException e) { 
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class UpdateDemo
