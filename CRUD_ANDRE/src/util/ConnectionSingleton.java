package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {

	private static String URL     = "localhost";
	private static String USUARIO  = "hr";
	private static String SENHA    = "root";
	private static Connection conn;
	
	public static Connection getConnection(){
		
		if(conn == null){
			synchronized (ConnectionSingleton.class) {
				conn = getCon();
			} 
		}
		return conn;
	}
	
	private static Connection getCon(){
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@"+URL+":1521:xe", USUARIO, SENHA);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	 
	
}
