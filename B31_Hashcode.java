// object class equals tostring hascode
class Laptop{
	private String model;
	private int price;
	public String toString(){
		return model + " : " + price;
	}
	public boolean equals (Laptop that){
		if(this.model.equals(that.model) && this.price == that.price){
			return true;
		} else {
			return false;
		}
	}
}
public class B31_Hashcode{
	public static void mian(String[] args){
		Laptop obj = new Laptop();
		obj.model = "Lenovo Yoga";
		obj.price = 1000;
		System.out.println(obj.toString());
		System.out.println(obj);
		Laptop obj2 = new Laptop(); 
		obj2.model = "Lenovo Yoga";
		obj2.price = 1000;
		System.out.println(obj2);
		boolean result = obj.equals(obj2);
		System.out.println(result);
	}
}