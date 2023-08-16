package AmdocsProjectFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ViewMechanic {

	public static void AllMech() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("VIEW OF ALL MECHANIC RECORDS");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mechanicdb", "root", "Sanjay@0610");

        String selectQuery1 = "SELECT * FROM mechanic";
        PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        while (resultSet1.next()) 
        {
                int mechId = resultSet1.getInt("mechanic_id");
                String mechName = resultSet1.getString("mechanic_name");
                String mechemail=resultSet1.getString("mechanic_email");
                String mechmobno= resultSet1.getString("mechanic_mob_no");
                String exp=resultSet1.getString("mechanic_exp");
                String time=resultSet1.getString("mechanic_time");

                System.out.println("Mechanic ID: " + mechId);
                System.out.println("Mechanic Name: " + mechName);
                System.out.println("Mechanic email: " + mechemail);
                System.out.println("Mechanic mobile number:"+mechmobno);
                System.out.println("Mechanic years of experience: " + exp);
                System.out.println("Mechanic availability time: " + time);
                
                System.out.println("  ");
                System.out.println("  ");
          }

        resultSet1.close();
        preparedStatement1.close();
		con5.close();

	}

}
