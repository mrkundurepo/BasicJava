// Static
class Mobile {
	String brand;
	int price;
	static String name;
	public void show(){
		System.out.println(brand + " : " + price + " : " + name);
	}
}
public class B19_Static{
	public static void main(String[] args){
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		obj1.name = "Smart Phone";
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		obj2.name = "Smart Phone";
		obj1.show();
		obj2.show();
		obj1.name = "Phone";
		obj1.show();
		obj2.show();
/*
		Refer static variable - not using object name but using class name

		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "Smart Phone";

		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile.name = "Smart Phone";
*/

	}
}