// Abstract and anonymous inner class
abstract class A {
	public abstract void show();
	public abstract void config();
}
class B extends A {
	public void show(){
		System.out.println("in B show");
	}
}
public class B36_Abstract_and_Anonymous_Inner{
	public static void main(String[] args){
		A obj = new B();
		obj.show();
		A obj1 = new A(){
			public void show(){
				System.out.println("In new show");
			}
			public void config(){
				System.out.println("In config");
			}
		};
		obj1.show();
		obj1.config();
	}
}