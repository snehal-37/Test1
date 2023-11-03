package demo;

public class Emp {

	String name = "Tom";
	int id = 01;
	double sal = 12500;
	String addr = "Mumbai";

	void meth() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+sal);
		System.out.println("Address "+addr);
	}

	public static void main(String[] args) {
		Emp e = new Emp();
		e.meth();
	}
}
