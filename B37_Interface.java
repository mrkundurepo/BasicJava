// Interface
interface A {
	int age=44;
	String area = "Mumbai";
	void show();
	void config();
}
interface X {
	void run();
}
interface Y extends X {}
class B implements A {
	public void show(){
		System.out.println("in B A show");
	}
	public void config(){
		System.out.println("in B A config");
	}
}
class B implements A, X {
	public void show(){
		System.out.println("in B A X show");
	}
	public void config(){
		System.out.println("in B A X config");
	}
	public void run(){
		System.out.println("B A X running...");
	}
}
class B implements A, Y {
	public void show(){
		System.out.println("in B A Y show");
	}
	public void config(){
		System.out.println("in B A Y config");
	}
	public void run(){
		System.out.println("B A Y running...");
	}
}
public class B37_Interface{
	public static void main(String[] args){
		A obj; 
		obj = new B();
		obj.show();
		obj.config();
		System.out.println(A.area);
		X obj1 = new B();
		obj1.run();
	}
}