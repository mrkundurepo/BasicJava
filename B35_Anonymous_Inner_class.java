// Anonymous inner class
class A {
	public void show(){
		System.out.println("in A show");
	}
}
public class B35_Anonymous_Inner_class{
	public static void main(String[] args){
		A obj = new A();
		obj.show();
		A obj1 = new A(){
			public void show1(){
				System.out.println("in new show");
			}
		};
		obj1.show1();
	}
}