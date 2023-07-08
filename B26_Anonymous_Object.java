// Anonymous Object
class A {
	public A(){
		System.out.println("Object created");
	}
	public void show(){
		System.out.println("in A show");
	}
}
public class B26_Anonymous_Object{
	public static void main(String[] args){
		A obj = new A();
		obj.show();
		new A().show;
	}
}