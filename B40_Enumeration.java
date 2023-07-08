// Enumeration
enum Status {
	Running, Failed, Pending, Success;
}
public class B40_Enumeration{
	public static void main(String[] args){
		Status ss = Status.Pending;
		if(ss == Status.Running){
			System.out.println("All Good");
		} else if(ss == Status.Failed){
			System.out.println("Try Again");
		} else if(ss == Status.Pending){
			System.out.println("Please Wait");
		} else {
			System.out.println("Done");
		}

		ss = Status.Success;
		switch(s){
		case Running: System.out.println("All good");
			break;
		case Failed: System.out.println("Try Again");
			break;
		case Pending: System.out.println("Please Wait");
			break;
		default: System.out.println("Done");
			break;
		}
	}
}