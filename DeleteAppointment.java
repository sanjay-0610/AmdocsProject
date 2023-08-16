package AmdocsProjectFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAppointment {

	public static void DeleteApp() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW DELETING AN APPOINTMENT");
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mechanicdb", "root","Sanjay@0610");
		Statement st2=con2.createStatement();
        
		System.out.println("Enter appointment id to delete:-");
		int a=sc.nextInt();
		
		String deleteQuery="delete from appointment where app_id= '"+a+"'";
		
		int res2=st2.executeUpdate(deleteQuery);
		//System.out.println("hello world")
		if(res2==0)
		{
			System.out.println("Record not deleted");
		}
		else
		{ 
			System.out.println("Record  deleted");
		}	
			
		//ResultSet rs=st.executeQuery("select * from customer");
		
		st2.close();
		con2.close();
		 

		

	}

}