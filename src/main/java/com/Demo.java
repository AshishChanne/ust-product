package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:db2://dashdb-txn-sbox-yp-lon02-07.services.eu-gb.bluemix.net:50000/BLUDB","lch38277","jhfp58-9k36rgqgg");

		System.out.println("connected......");
	}

}
