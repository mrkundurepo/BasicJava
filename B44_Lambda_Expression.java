// Lambda Expression
@FunctionalInterface
interface A{
	void show();
}
public class B44_Lambda_Expression{
	public static void main(String[] args){
		/*
		A obj = new A (){
			public void show(){
				System.out.println("In show A");
			}
		};
		obj.show();
		*/
		A obj = () -> {
			System.out.println("in show A");
		};
		obj.show();
	}
}