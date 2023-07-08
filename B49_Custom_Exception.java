// Custom Exception
class NavException extends Exception{
	public NavException(String string){
		super(string);
	}
}
public class B49_Custom_Exception{
	public static void main(String[] args){
		int i = 20;
		int j = 0;
		try{
			j = 18/i;
			if(j == 0){
				throw new NavException("I don't want to print zero");
			}
		} catch(NavException e){
			j = 18/1;
			System.out.println("Thats the default output" + e);
		} catch(Exception e){
			System.out.println("Something went wrong" + e);
			System.out.println(j);
			System.out.println("Bye");
		}
	}
}