package basics;

public class InheritanceBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbiBank = new SBI();
		sbiBank.principal=10000;
		sbiBank.roi=5.0f;
		sbiBank.time=1;
		float si =sbiBank.simpleInterest(sbiBank.principal, sbiBank.roi, sbiBank.time);
		System.out.println("Simple interest sbi "+si);
		
		
		HDFC hdfcBank = new HDFC();
		hdfcBank.principal=10000;
		hdfcBank.roi=6.0f;
		hdfcBank.time=1;
		si =hdfcBank.simpleInterest(hdfcBank.principal, hdfcBank.roi, hdfcBank.time);
		System.out.println("Simple interest hdfc "+si);
	}
}

class Bank{	
	int principal;
	float roi;
	int time;
	
	
	public float simpleInterest(int principal,float roi,int time) {
		return (principal*roi*time)/100;
	}
}

class SBI extends Bank{
	
}

class HDFC extends Bank{
	
}


