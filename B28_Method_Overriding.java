// Method Overriding
class A {
	public void show(){
		System.out.println("in A show");
	}
	public void config(){
		System.out.println("in A config");
	}
}
class B extends A {
	public void show(){
		System.out.println("in B show");
	}
}
class Calc{
	public int add(int n1, int n2){
		return n1 + n2;
	}
}
class AdvCalc extend Calc{
	public int add(int n1, int n2){
		retun n1 + n2 + 1;
	}
}
public class B28_Method_Overriding{
	public static void main(String[] args){
		A obj = new A();
		obj.show();
		B obj1 = new B();
		obj1.show();
		obj1.config();
		AdvCalc obj2 = new AdvCalc();
		int r1 = obj2.add(3,4);
		System.out.println(r1);
	}
}