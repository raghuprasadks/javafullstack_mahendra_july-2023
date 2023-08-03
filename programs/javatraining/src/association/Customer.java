package association;

import java.util.List;

public class Customer {
	private int id;	
	private String name;
	private long mobile;
	private String email;
	// one to many relationship
	//private List<Address> address;
	// one to one relationship
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	// Default constructor
	public Customer() {
		
	}
	// named/parameterized constructor
   public Customer(int id,String name,long mobile,String email) {
	   this.id=id;
	   this.name=name;
	   this.mobile = mobile;
	   this.email = email;
	   
   }
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	**/
	
	public String toString() {
		return "Id "+this.id + " Name : "+this.name;
	}
	
}
