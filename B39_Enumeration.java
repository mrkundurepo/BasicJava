// Enumeration
enum Status {
	Running, Failed, Pending, Success;
}
public class B39_Enumeration{
	public static void main(String[] args){
		int in = 5;
		Status s = Status.Running;
		System.out.println(s);
		System.out.println(s.ordinal());
		Status s1 = Status.Failed;
		System.out.println(s1);
		System.out.println(s1.ordinal());
		Status[] s2 = Status.values();
		System.out.println(s2[0]);
		for(Status s: s2){
			System.out.println(s + " : " + s.ordinal());
		}	
	}
}