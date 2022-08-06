package oops;

public class Employee {
	public String Name;
	public int EmpId;
	public String Dept;
	public Employee() {
		System.out.println("Inside the constructor");
	}
	public Employee(String Name, int EmpId, String Dept) { // allowed to have same name
		this.Name =Name;// this refers class variable. 
		this.EmpId=EmpId;
		this.Dept=Dept;
	}
	
	public void Display() {
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Dept);
	}

}
