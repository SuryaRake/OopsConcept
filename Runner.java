package oops;

public class Runner {

	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.Name = "Surya";
		E1.EmpId=12345;
		E1.Dept="HR";
		
		Employee E2 = new Employee("Anvit", 126, "Finance");
		E2.Display();
		Employee E3 = new Employee("Advik", 127, "Accounts");
		Employee E4 = new Employee("Rakesh", 128, "Dental");
		
		E1.Display();
		E3.Display();
		E4.Display();
		
		//CountUpto C1 = new CountUpto();
	//	C1.addUp(4);
		
		
		Bank B = new Bank();
		BOABank B1 = new BOABank();
		
		B.ChkBal();
		B1.ccBal();
		int MINIMUMBal = B.MinBal();
		
		System.out.println(MINIMUMBal);
		System.out.println(B.AccNum);
		System.out.println(B1.AccNum);
		
		
		OverloadingExample obj = new OverloadingExample();
		int SqrArea = obj.Area(5);
		int RectArea = obj.Area(4, 3);
		float area = obj.Area(3.0f);//character f to be added otherwise give double
		
		System.out.println(SqrArea);
		System.out.println(RectArea);
		System.out.println(area);
				
		//overriding example
		//1. always need inheritance to do method overriding. 
		
		B.closeAcc(1232); // according to the object the method will be called - method overriding
		B1.closeAcc(4532); // according to the object the method will be called - method overriding
		
		//Abstraction
		//all absraction methods should imlemented by the respective child class
		//Abstraction class can have non abtract method
		//No object for abstract class.
		
		ChromeBrowser ch = new ChromeBrowser();
		FirefoxBrowseer ff = new FirefoxBrowseer();
		ch.closeBrowser();
		ch.openBrowser();
		ff.closeBrowser();
		ff.openBrowser();
		ch.quitBrowser();
		ff.quitBrowser();
		
		
		//INterface
		
		HondaCar HC = new HondaCar();
		HC.Doors();
		HC.Driver();
		HC.fuelChk();
		HC.start();
		HC.stop();
		HC.Wheels();
		
		
		//Encapsulation
		//implement/access private variable in another class using getters and setters
		//create object of encapsulation class and then access
		
		EncapsulationEX ENC = new EncapsulationEX();
		ENC.setAcc(1234);
		System.out.println(ENC.getAcc());
		
		ENC.setNAme("ABC");
		System.out.println(ENC.getNAme());
		
		ENC.setPlace("Thrissur");
		System.out.println(ENC.getPlace());
		
		
		
				

	}

}
