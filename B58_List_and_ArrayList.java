// List and ArrayList
import java.util.List;
import java.util.ArrayList;
public class B58_List_and_ArrayList{
	public static void main(String[] args){
		List<Integers> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		nums.add(6);
		System.out.println(nums);
		System.out.println(nums.get(2));
		System.out.println(nums.indexOf(5));
		for(Object n: nums){
			int num = (Integer)n;
			System.out.println(num*2);
		}												
	}
}