// Final
final class Calc{
	public void show(){
		System.out.println("in calc show");
	}
	public void add(int a, int b){
		System.out.println(a + b);
	}
} 
class Calc2{
	public final void show(){
		System.out.println("By Navin");
	}
	public void add(int a, int b){
		System.out.println(a + b);
	}
}
class AdvCalc extends Calc {
	public void show(){
		System.out.println("By John");
	}
}
public class B30_Final_Keyword{
	public static void main(String[] args){
		int num = 8;
		num = 9;
		System.out.println(num);
		final int numb = 80;
		System.out.println(numb);
		Calc obj = new Calc();
		obj.show();
		obj.add(4,5);
		AdvCalc obj1 = new AdvCalc();
		obj1.show();
		obj1.add(6,8);

	}
}