// Upcasting and Downcasting
// Type casting: double d=4.5; int i= (int)d;

class A {
	public void show1(){
		System.out.println("In A show");
	}
}
class B extends A{
	public void show2(){
		System.out.println("In B show");
	}
}
public class B32_Upcasting_and_Downcasting{
	public static void main(String[] args){
		// Upcasting - implicit
		A obj = (A) new B();
		obj.show1();
		// Downcasting - explicit
		B obj1 = (B)obj;
		obj1.show2();
	}
}