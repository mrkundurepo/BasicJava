// Methods
class Computer{
	public void playMusic(){
		System.out.println("Music Playing");
	}
	public getMeAPen(int cost){
		if(cost >= 10){
			return "Pen";
		} else {
			return "Nothing";
		}
	}
}
public class B12_Methods{
	public static void main(String[] args){
		Computer obj = new Computer();
		obj.playMusic();
		String str2 = obj.getMeAPen(2);
		System.out.println(str2);
		String str = obj.getMeAPen(12);
		System.out.println(str);
	}
}