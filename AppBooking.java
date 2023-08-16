package AmdocsProjectFinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AppBooking {

	public static void BookingApp() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("BOOK AN APPOINTMENT ");
		System.out.println("Enter appointment id:-");
		int app_id=sc.nextInt();
		System.out.println("Enter user id");
		int user_id =sc.nextInt();
		System.out.println("Enter mechanic id");
		int mechanic_id= sc.nextInt();
		System.out.println("Enter appointment date");
		String app_date=sc.next();
		System.out.println("Enter appointment slot");
		String app_slot= sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mechanicdb", "root","Sanjay@0610");
		Statement st=con.createStatement();

		String insertQuery="insert into appointment values('"+app_id+"','"+user_id+"','"+mechanic_id+"','"+app_date+"','"+app_slot+"')";
		
		int res=st.executeUpdate(insertQuery);
		//System.out.println("hello world")
		if(res==0)
		{
			System.out.println("Record not inserted");
		}
		else
		{ 
			System.out.println("Record  inserted");
		}	
			
		//ResultSet rs=st.executeQuery("select * from customer");
		
		st.close();
		con.close();
	}

}