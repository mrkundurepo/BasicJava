// Functional Interface
@FunctionalInterface 
interface A {
	void show();
}
class B implements A {
	public void show(){
		System.out.println("in show B");
	}
}
public class B43_Functional_Interface{
	public static void main(String[] args){
		A obj = new A(){
			public void show(){
				System.out.println("in show A");
			}
		};
		obj.show();
	}
}