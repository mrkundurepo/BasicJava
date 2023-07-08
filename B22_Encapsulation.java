// Encapsulation
class Human {
	private int age;
	private String name;
	// getters
	public int getAge(){
		return age;
	}
	// setters
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
}
public class B22_Encapsulation{
	public static void main(String[] args){
		Human obj = new Human();
		obj.setAge(11);
		obj.setName("Navin");
		System.out.println(obj.getName() + " : " + obj.getAge());
	}
}