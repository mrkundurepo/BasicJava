// Syntactical sugar
@FunctionalInterface
interface A {
	void show(int i);
}
public class B45_Syntactical_Sugar{
	public static void main(String[] args){
	/*
		A obj = new A(){
			public void show(int i){
				System.out.println("in show A" + i);
			}
		};
		obj.show(5);
	*/
		A obj = i -> System.out.println("in show A" + i);
		obj.show(5);
	}
}