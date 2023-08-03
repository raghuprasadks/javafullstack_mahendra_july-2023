package association;

public class Address {
	
	int houseno;
	String housename;
	String addresstype;
	String location;
	int pincode;
	// Default constructor
	public Address() {
		
	}
	
	// named construtor
	public Address(int _houseno,String _housename,String _addresstype,String _location,int _pincode){
	this.houseno=_houseno;
	this.housename =_housename;
	this.addresstype=_addresstype;
	this.pincode=_pincode;
		
	}
	
}
