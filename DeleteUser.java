package AmdocsProjectFinal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUser {

	public static void DeleteCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ID TO DELETE YOUR DETAILS");
		
		
		System.out.println("PRESS ANY OTHER KEY TO CANCEL");
		
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mechanicdb", "root","Sanjay@0610");
		Statement st2=con2.createStatement();
        
		System.out.println("Enter user id to delete:-");
		int a=sc.nextInt();
		
		String deleteQuery="delete from customers where user_id= '"+a+"'";
		
		int res2=st2.executeUpdate(deleteQuery);
		
		if(res2==0)
		{
			System.out.println("Record not deleted");
		}
		else
		{ 
			System.out.println("Record  deleted");
		}	
			
		
		st2.close();
		con2.close();

		       
		


	}

}
