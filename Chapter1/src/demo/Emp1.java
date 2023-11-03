package demo;

public class Emp1 {
	String name, addr;
	int id;
	double sal;

	public Emp1(String name, String addr, int id, double sal) {
		super();
		this.name = name;
		this.addr = addr;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", addr=" + addr + ", id=" + id + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		Emp1 e1 = new Emp1("Jerry","Mumbai",02,15000);
		System.out.println(e1);
	}
}
