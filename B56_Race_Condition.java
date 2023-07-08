// Race Condition
class Counter{
	int count;
	public void increment(){
		count++;
	}
}
public class B56_Race_Condition{
	public static void main(String[] args){
		Counter c = new Counter();
		Runnable obj1 = () -> {
			for(int i=1; i<=1000; i++){
				c.increment();
			}
		};
		Runnable obj2 = () -> {
			for(int i=1; i<=1000; i++){
				c.increament();
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}