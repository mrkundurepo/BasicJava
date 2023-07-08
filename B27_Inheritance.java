// Inheritance
// Demo1.java
class Calc {
	public int add(int n1, int n2){
		return n1 + n2;
	}
	public int sub(int n1, int n2){
		retun n1 - n2;
	}
}
// Demo2.java
public class AdvCalc extends Calc{
	public int multi(int n1, int n2){
		return n1 * n2;
	}
	public int div(int n1, int n2){
		return n1/n2;
	}
}
// Demo3.java
public class VeryAdvCalc extends AdvCalc{
	public double power(int n1, int n2){
		return Math.pow(n1,n2);
	}
}

public class B27_Inheritance{
	public static void main(String[] args){
		// Demo1.java		
		Calc obj = new Calc();
		int r1 = obj.add(4,5);
		int r2 = obj.sub(7,3);
		System.out.println(r1 + " " + r2);
		// Demo2.java
		AdvCalc obj1 = new AdvCalc();
		r1 = obj1.add(4,5);
		r2 = obj1.sub(7,3);
		int r3 = obj1.multi(4,5);
		int r4 = obj1.div(15,3);	
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
		// Demo3.java
		VeryAdvCalc obj2 = new VeryAdvCalc();
		r1 = obj2.add(4,5);
		r2 = obj2.sub(7,3);
		r3 = obj2.multi(4,5);
		r4 = obj2.div(15,3);
		int r5 = obj2.power(4,2);	
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
		
	}
}