package AmdocsProjectFinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SingleUser {

	public static void SingleCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("RECORD ALL DETAILS OF A USER ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con4=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mechanicdb", "root","Sanjay@0610");
		Statement st4=con4.createStatement();
        
		System.out.println("Enter user id to print values:-");
		int a4=sc.nextInt();
		
		String selectQuery="select * from customers where user_id= ?";
		PreparedStatement preparedStatement=con4.prepareStatement(selectQuery);
		preparedStatement.setInt(1, a4);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
            int custId = resultSet.getInt("user_id");
            String custName = resultSet.getString("user_name");
            String vehicleNo=resultSet.getString("vehicle_no");
            String custmobno= resultSet.getString("user_mob_no");
            String addr=resultSet.getString("user_address");

            System.out.println("user ID: " + custId);
            System.out.println("user Name: " + custName);
            System.out.println(" vehicle Number: " + vehicleNo);
            System.out.println("user mobile number:"+custmobno);
            System.out.println("user address: " + addr);
            
            
                               }
		st4.close();
		con4.close();

        resultSet.close();
        preparedStatement.close();

	}

}
