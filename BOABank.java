package oops;

public class BOABank extends Bank{
	
	public int CCNumb;
	public int AccNum; // same variable as in the parent class
	
	public void ccBal() {
		System.out.println("CC Balance in BOA");
		this.AccNum = 265357;
		super.AccNum = 76466;
	}
	public void closeAcc(int AccNum) {
		System.out.println("Inside the child class BOA");
	}
	
	
	
		

}
