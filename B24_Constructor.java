// Constructor
class Human {
	private int age;
	private String name;
	// Default constructor
	public Human(){
		System.out.println("In constructor");
		age = 12;
		name = "John";
	}
	// Parameterized constructor
	public Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	public Human(String name){
		this.age = 12;
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		this.age = age;
	}
	public String getName(){
		return nam
	}
	public void setName(String name){
		this.name = name;
	}
}
public class B24_Constructor{
	public static void main(String[] args){
		Human obj = new Human();
		Human obj1 = new Human();
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj1.getAge());
		obj.setAge(30);
		obj.setName("Navin");
		System.out.println(obj.getName() + " : " + obj.getAge());
		Human obj2 = new Human(18,"Pawan");
		System.out.println(obj2.getName() + " : " + obj2.getAge());
		Human obj3 = new Human("Savan");
		System.out.println(obj3.getName() + " : " + obj3.getAge());

	}
}