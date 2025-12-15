package haftaaaaa15Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exception4 {

	public static void main(String[] args) {
		//System.ou.println("sjdks");
//compile error
		
		//veri tabanı bağlantısı kurulacak 
		String dataBase="jdbc:mysql://localhost:3306/testdb";
		String userName="root";
		String password="1234";
		try {
			Connection connection=DriverManager.getConnection(dataBase,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
