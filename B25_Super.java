// Super & parameterized super call
class A extends Object{
	public A(){
		super();
		System.out.println("in A");
	}
	public A(int n){
		super();
		System.out.println("in A");
	}
}
class B extends A {
	public B(){
		super();
		System.out.println("in B");
	}
	public B(int n){
		super(n);
		System.out.println("in B int");
	}
	public B(double n){
		this();
		System.out.println("in B double");
	}
}
public class B25_Super{
	public static void main(String[] args){
		B obj = new B();
		B obj1 = new B(5);
	}
}