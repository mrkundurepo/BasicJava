// Static Method
class Mobile {
	String brand;
	int price;
	static string name;
	public void show(){
		System.out.println(brand + " : " + price + " : " + name);
	}
	public static void show1(Mobile obj){
		System.out.println("in static method");
		System.out.println(obj.brand + " : " + obj.price + " : " + name + " demo util ");
	}
}
public class B21_Static_Method{
	public static void main(String[] args){
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "SmartPhone";
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile.name = "Smartphone";
		obj1.show();
		obj2.show();
		Mobile.show();
		Mobile.show1(obj1);
		Mobile.show1(obj2);
	}
}