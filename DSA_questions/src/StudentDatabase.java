import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDatabase {

	private static Connection connection = null;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		StudentDatabase studentDB = new StudentDatabase();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "root6";
			
			connection = DriverManager.getConnection(dbURL, username, password);
			
			System.out.println("Enter the choice");
			System.out.println("1. Insert record");
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1:
				studentDB.insertRecord();															
				break;
				
			default:
				break;
			}
			
			
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong");
		}
		
	}
	
	private void insertRecord() throws SQLException {
		System.out.println("inside insert record()");
		
		String sql = "insert into student(name, percentage, address) values ('Raj',85.5,'new delhi') ";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int rows = preparedStatement.executeUpdate();
		
		if(rows > 0) {
			System.out.println("Record inserted successfully");
		}
	}

}
