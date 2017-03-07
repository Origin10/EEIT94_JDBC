package com.iii.eeit94.LinCZ;

public class SQLcmdProcess {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql ="select ename salary from employee";
		String[] sqlSplit = null;
		
		sql.toLowerCase();
		int sqlLen = sql.split(" ").length;
		
		for(int i=1;i<=sqlLen;i++){
			sqlSplit = sql.split(" ");
			switch (sqlSplit[0]){
			case "select":
				break;
			case "insert":
				break;
			case "creat":
				break;
			case "drop":
				break;
			case "delete":
				break;
			case "alter":
				break;
			case "update":
				break;
			}
		}
		
		System.out.println(sqlSplit[0]);
		
		
	}
	

}
