package datastructures;

import java.util.ArrayList;
import java.util.List;

public class CartDemo {
	// Generics
	static List<Product> cart = new ArrayList<Product>();
	public void addProducts() {
		Product prod1 = new Product(1,"SmartPhone","16 GB 64 px water proof","Vivo",35000);
		Product prod2 = new Product(2,"Laptop","16 GB 1TB HDD","Lenovo",85000);
		Product prod3 = new Product(3,"Smart Watch","Smart watch 360","Boat",5000);
		cart.add(prod1);
		cart.add(prod2);
		cart.add(prod3);
	}
	
	public void displayProducts() {
		
		int totalprice=0;
		for(int i=0;i<cart.size();i++) {
			Product prod = cart.get(i);
			totalprice= totalprice+prod.price;
			//System.out.println("Name "+prod.name + " Price "+prod.price);
			System.out.println(prod);
		}
		System.out.println("total price "+totalprice);
	}
	
	public static void main(String[] args) {
		CartDemo mycartdemo = new CartDemo();
		mycartdemo.addProducts();
		mycartdemo.displayProducts();
	}

}
class Product{	
	int code;
	String name;
	String desc;
	String manufacturer;
	int price;
	public Product(int _code,String _name,String _desc,String _manu,int _price) {
		this.code = _code;
		this.name = _name;
		this.desc = _desc;
		this.manufacturer=_manu;
		this.price = _price;
	}
	public String toString() {
		return "Code "+this.code +"Name "+this.name+" Description "+this.desc +" Manu "+this.manufacturer +"Price "+this.price;
	}
}


