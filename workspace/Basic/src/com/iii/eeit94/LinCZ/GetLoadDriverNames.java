package com.iii.eeit94.LinCZ;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class GetLoadDriverNames {

	public static void main(String[] args) {
		Enumeration<Driver> drivers=DriverManager.getDrivers();
		while(drivers.hasMoreElements()){
			Driver driver= drivers.nextElement();
			System.out.println(driver.getClass().getName());
		}

	}

}
