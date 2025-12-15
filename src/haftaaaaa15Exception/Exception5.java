package haftaaaaa15Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exception5 {

	public static void main(String[] args) throws SQLException {
		String dataBase="jdbc:mysql://localhost:3306/testdb";
		String userName="root";
		String password="1234";
		
			Connection connection=DriverManager.getConnection(dataBase,userName,password);

	}
	/*Checked Exception: 
	 * Java derleyicisi tarafından ele alınması zorunludur. 
	 * ele alınmadığında derlenmesine izin verilmez.Compile Error
	 * bu nedenle derleme hatası gibi görünür*/

}
