// Exception throw keyword
public class B48_Exception_Throw{
	public static void main(String[] args){
		int i=20;
		int j=0;
		try{
			j=18/i;
			if(j==0){
				throw new ArithmeticException("I don't want to print zero ");
			}
		} catch(ArithmeticException e){
			j = 18/1;
			System.out.println("Thats that default output " + e);
		} catch(Exception e){
			System.out.println("Something went wrong " + e);
		}
		System.out.println(j);
		System.out.println("Bye");
	}
}