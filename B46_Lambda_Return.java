// Lambda expression with return
@FunctionalInterface
interface A {
	void add(int i, int j);
}
public class B46_Lambda_Return {
	public static void main(String[] args){
	/*
		A obj = new A(){
			public int add(int i, int j){
				return i+j;
			}
		};
		int result = obj.add(5,4);
		System.out.println(result);
	*/
		A obj = (i,j) -> i+j; 
		int result = obj.add(5,4);
		System.out.println(result);	
	}
}