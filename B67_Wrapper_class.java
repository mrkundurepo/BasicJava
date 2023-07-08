// Wrapper class
public class B67_Wrapper_class{
	public static void main(String[] args){
		int num = 7;
		Integer num1 = new Integer(8);
		System.out.println(num1);
		Integer num1 = 8;

		// Autoboxing
		int num = 7;
		Integer num1 = num;
		System.out.println(num1);

		// Autounboxing
		num = num1.intValue();
		int num2 = num;
		System.out.println(num2);

		// Wrapper class with parse
		String str = "12";
		int num3 = Integer.parseInt(str);
		System.out.println(num3*2);
	}
}