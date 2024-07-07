import java.sql.*;

public class App {
    private static final String url="jdbc:mysql://localhost:3306/JDBC_TRY";
    private static final String username="root";
    private static final String password="rajat";
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection =DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query="Select * from student";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                String name_01 = resultSet.getString("name");
                int age_01=resultSet.getInt("age");
                System.out.println("Name: " + name_01 + " age: " + age_01 + '\n');
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }


        // try{
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        // }catch(Exception e){
        // System.out.println(e.getMessage());	
        // }
    
        // try{
        //     Connection con=DriverManager.getConnection(url,username,password);
        //     Statement st=con.createStatement();
        //     String query="Select * from student where age<21";
        //     ResultSet RS=st.executeQuery(query);
        //     while(RS.next()){
        //     String name_01=RS.getString("name");
        //     int age_01=RS.getInt("age");
        //     System.out.println("Name: " + name_01 + " age: " + age_01 + "\n");
        //     }
        // }catch(SQLException e){
        //     System.out.println(e.getMessage());
        // }

        // try{
        //     Connection connection = DriverManager.getConnection(url, username, password);
        //     String query="Insert into student(name,age) values (?, ?)";
        //     PreparedStatement preSta=connection.prepareStatement(query);
        //     preSta.setString(1,"New_Name");
        //     preSta.setInt(2,20);
        //     int rowAffected=preSta.executeUpdate();
        //     if(rowAffected>0){
        //         System.out.println("Successfully added a row");
        //     }else{
        //         System.out.println("Not able to add the given row");
        //     }
        // }catch(SQLException e){
        //     System.out.println(e.getMessage());
        // }
    }
}
