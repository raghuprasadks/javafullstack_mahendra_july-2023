package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo_2_PreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahendradb", "root",
					"kaushalya@2017");
			//Statement stmt = con.createStatement();
			System.out.println("Insert ");
			PreparedStatement stmt = con.prepareStatement("insert into product(name,description,price,supplierid) values (?,?,?,?)");
			stmt.setString(1, "Intel 12");
			stmt.setString(2, "Intel 12 desc");
			stmt.setInt(3, 111111);
			stmt.setInt(4,1);
		
			int records =stmt.executeUpdate();
			System.out.println("Number of records inserted is "+records);
			/**
			Implement Update and delete
			*/
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
