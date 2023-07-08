// Static block 
class Mobile{
	String brand;
	int price;
	static String name;
	static {
		name = "Phone";
		System.out.println("in static block");
	}
	public Mobile(){
		brand = "";
		print = 200;
		System.out.println("in constructor");
	}
	public void show(){
		System.out.println(brand + " : " + price + " : " + name);
	}
}
public class B20_Static_Block{
	public static void main(String[] args){
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "Smart Phone";
		obj1.show();
		Mobile obj2 = new Mobile();

		// donot creat an object but load a class and instantiate clas
		Class.forName("Mobile");
	}
}