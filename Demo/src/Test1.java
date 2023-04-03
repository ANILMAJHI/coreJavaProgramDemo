class Parant{
	public void m1()
	{
		System.out.println("parant class m1 method...");
	}
	public void m2()
	{
		System.out.println("Child class m4s method...");
	}
}
class Child extends Parant{
	public void m1()
	{
		System.out.println("parant class m1 method...");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Parant p=new Child();
		p.m2();
	}
}
