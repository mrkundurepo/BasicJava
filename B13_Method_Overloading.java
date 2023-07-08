// Method Overloading
class Calculator{
	int numsqu;
	public int add(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
	public int add(int n1, int n2){
		return n1 + n2;
	}
	public double add(double n1, int n2){
		return n1 + n2;
	}
}
public class B13_Method_Overloading{
	public static void main(String[] args){
		Calculator obj = new Calculator();
		int r1 = obj.add(3,4,5);
		System.out.println(r1);
		int r2 = obj.add(3,7);
		System.out.println(r2);
		int r3 = obj.add(76.43,5);
		System.out.println(r3);

	}
}