package oops;

public class Bank {
	
	public int AccNum;
	
	public void ChkBal(){
		
		System.out.println("Bank Balance");
	}
	
	public int MinBal() {
		return 1000;
	}
		public void closeAcc(int AccNum) {
			System.out.println("INside the Bank class");
		
		
	}

}
