
package learning;
import java.sql.*;
public class javamysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delete();

	}
	public static void readRecords()
	{
		String url = "jdbc:mysql://localhost:3306/bus";
		String userName = "root";
		String password = "12345678";
		try {
			String query = "select * from employee";
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			ResultSet rs =  st.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("Id is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Salary is "+rs.getInt(3));
			}
			 conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insert()
	{
		String url = "jdbc:mysql://localhost:3306/bus";
		String userName = "root";
		String password = "12345678";
		try {
			String query = "insert into employee values (4,'rahul',24000)";
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			int rs =  st.executeUpdate(query);
			
			System.out.println("No. of rows affected: "+rs);
			 conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insertvar()
	{
		String url = "jdbc:mysql://localhost:3306/bus";
		String userName = "root";
		String password = "12345678";
		try {
			int id = 5;
			String name = "dhanush";
			int salary = 45000;
			String query = "insert into employee values ("+id+", '"+name+"'," +salary+");";
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			int rs =  st.executeUpdate(query);
			
			System.out.println("No. of rows affected: "+rs);
			 conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void PrepareSt()
	{
		String url = "jdbc:mysql://localhost:3306/bus";
		String userName = "root";
		String password = "12345678";
		try {
			int id = 15;
			String name = "dhanush";
			int salary = 45000;
			String query = "insert into employee values (?,?,?);";
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setInt(3, salary);
			int rs =  pst.executeUpdate();
			
			System.out.println("No. of rows affected: "+rs);
			 conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void delete()
	{
		String url = "jdbc:mysql://localhost:3306/bus";
		String userName = "root";
		String password = "12345678";
		try {
			int id = 15;
			String name = "dhanush";
			int salary = 45000;
			String query = "delete from employee where emp_id  = "+id;
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			
			int rs =  st.executeUpdate(query);
			
			System.out.println("No. of rows affected: "+rs);
			 conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	

}
