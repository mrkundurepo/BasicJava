// Ducking exception using throws
class A {
	public void show(){
		try {
			class.forName("Calc");
		}
		catch(ClassNotFoundException e){
			System.out.println("Not able to find the class" + e);
		}
	}
}
public class B50_Throws{
	static{
		System.out.println("Class loaded");
	}
	public static void main(String[] args){
		A obj = new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}