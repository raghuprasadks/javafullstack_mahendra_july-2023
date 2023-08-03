package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo_1_CRUD {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahendradb", "root",
					"kaushalya@2017");
			Statement stmt = con.createStatement();
			System.out.println("Insert ");
		
			int records =stmt.executeUpdate("insert into product(name,description,price,supplierid) values ('Intel 11','Intel 11 32 GB',95000,1)");
			System.out.println("Number of records inserted is "+records);
			
			System.out.println("Update ");
			
			records =stmt.executeUpdate("update product set price = 100000 where code =1");
			System.out.println("Number of records updated is "+records);
			
			System.out.println("Delete ");
			
			records =stmt.executeUpdate("delete from product where code =2");
			System.out.println("Number of records deleted is "+records);
			
			
			System.out.println("Select ");
			ResultSet rs = stmt.executeQuery("select * from product");
			
			while (rs.next())
				
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) +" "+rs.getInt(4));
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
