// Polymorphism
// Dynamic method dispatch - run time polymorphism
class Computer {}
class Laptop extends Computer{}
class A {
	public void show(){
		System.out.println("in A show");
	}
}
class B extends A {
	public void show(){
		System.out.println("in B show");
	}
}
class C extends A {
	public void show(){
		System.out.println("in C show");
	}
}
public class B29_Polymorphism{
	public static void main(String[] args){
		A objz = new A();
		objz.show();
		objz = new B();
		objz.show();
		objz = new C();
		objz.show();
		B obj = new B();
		obj.show();
		A objb = new B();
		objb.show();
		Laptop obj1 = new Laptop();
		Computer obj1b = new Laptop();
	}
}