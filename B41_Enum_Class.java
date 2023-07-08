// Enum Class
enum Status{
	Running, Failed, Pending, Success;
}
enum Laptop {
	Macbook(2000), DellXPS(2200), MSSurface, ThinkPad(1800);
	private int price;
	private Laptop(){
		price = 500;
	}
	private Laptop(int price){
		this.price = price;
		System.out.println("in laptop" + this.name());
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}
public class B41_Enum_Class {
	public static void main(String[] args){
		Status s = Status.Success;
		System.out.println(s.getClass().getSuperClass());

		Laptop lap1 = Laptop.Macbook;
		System.out.println(lap1 + " : " + lap1.getPrice());
		for(Laptop lap: Laptop.values()){
			System.out.println(lap + " : " + lap.getPrice());
		}
	}
}