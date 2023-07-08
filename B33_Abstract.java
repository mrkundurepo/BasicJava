// Abstract Keyword
abstract class Car{
	// Declaring method
	public abstract void drive();
	public abstract void fly();
	public void playMusic(){
		System.out.println("Play music");
	}
}
abstract class WagonR extends Car {
	// Defining methods
	public void drive(){
		System.out.println("Driving...");
	}
}
class UpdateWagonR extends WagonR {
	public void fly(){
		System.out.println("Flying...");
	}
}
public class B33_Abstract{
	public static void main(String[] args){
		Car obj = new UpdatedWagonR();
		obj.fly();
		obj.drive();
		obj.playMusic();
	}
}