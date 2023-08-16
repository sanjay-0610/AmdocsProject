package AmdocsProjectFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AllUser {
	
	 public static void AllCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("VIEW OF ALL CUSTOMER RECORDS");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mechanicdb", "root", "Sanjay@0610");

        String selectQuery1 = "SELECT * FROM customers";
        PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        while (resultSet1.next()) {
            int custId = resultSet1.getInt("user_id");
            String custName = resultSet1.getString("user_name");
            String vehicleNo = resultSet1.getString("vehicle_no");
            String custMobNo = resultSet1.getString("user_mob_no");
            String addr = resultSet1.getString("user_address");

            System.out.println("User ID: " + custId);
            System.out.println("user Name: " + custName);
            System.out.println("Vehicle Number: " + vehicleNo);
            System.out.println("User Mobile Number: " + custMobNo);
            System.out.println("User Address: " + addr);
            System.out.println();
                                     }

        resultSet1.close();
        preparedStatement1.close();
  
		
		con5.close();

	}

}