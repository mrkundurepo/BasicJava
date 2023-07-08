// Multiple Threads
class A {
	public void show(){
		for(int i=1; i<=10; i++){
			System.out.println("hi");
		}
	}
}
class B{
	public void show(){
		for(int i=1;i<=10;i++){
			System.out.println("hello");
		}
	}
}
public class B53_Multiple_Threads{
	public static void main(String[] args){
		A obj1 = new A();
		B obj2 = new B();
		obj1.show();
		obj2.show();
	}
}