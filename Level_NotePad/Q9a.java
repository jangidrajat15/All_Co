//package Level_NotePad;
import java.sql.*;

public class Q9a {
private static final String url="jdbc:mysql://localhost:3306/JDBC_TRY";
private static final String userName="root";
private static final String passWord="rajat";

public static void main(String[] args){
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){
	System.out.println(e.getMessage());	
	}

	try{
		Connection con=DriverManager.getConnection(url,userName,passWord);
		Statement st=con.createStatement();
		String query="Select * from student where age<20";
		ResultSet RS=st.executeQuery(query);
		while(RS.next()){
		String name_01=RS.getString("name");
		int age_01=RS.getInt("age");
		System.out.println("Name: " + name_01 + " age: " + age_01 + "\n");
		}
	}catch(SQLException e){
		System.out.println(e.getMessage());
	}
	}	    
}
