package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Sample s=new Sample();
//		String dburl="jdbc:mysql:// localhost:3306/rama";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql:// localhost:3306/rama", "root","rama");
	   Statement st=conn.createStatement();
	   ResultSet rs=st.executeQuery("select *from patient");
	   conn.close();
	   
	}

}
 