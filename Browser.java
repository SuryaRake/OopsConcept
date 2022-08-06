package oops;

public abstract class Browser {
	
	public abstract void openBrowser();
	public abstract void closeBrowser();
	public void quitBrowser(){
		System.out.println("QUitting from abstract class");
		
	}
}
