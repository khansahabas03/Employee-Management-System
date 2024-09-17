package test;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class DBConnection {
	    private static final String JDBC_URL = 
	    		"jdbc:oracle:thin:@localhost:1521:orcl";
	    private static final String USERNAME = "KHAN123";
	    private static final String PASSWORD = "7978";

	    // Static method to get a database connection
	    public static Connection getCon() {
	        Connection con = null;
	        try {
	            // Load the MySQL JDBC driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            // Establish the connection
	            con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return con;
	    }
	}

