// Change in object value
class Calculator{
	int numsqu = 5;
	public int add(int n1, int n2){
		return n1 + n2;
	}
}
public class B14_Object_Value{
	public static void main(String[] args){
		Calculator obj = new Calculator();
		Calculator obj1 = new Calculator();
		int r1 = obj.add(56,77);
		int r2 = obj1.add(6,87);		
		System.out.println(r1);
		System.out.println(r2);
		obj.numsqu = 8;
		System.out.println(obj.numsqu);
		System.out.println(obj1.numsqu);

	}
}