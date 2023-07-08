// Collection Interface
import java.util.Collection;
import java.util.ArrayList;
public class B57_Collection_Interface{
	public static void main(String[] args){
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		System.out.println(nums);
		for(int n: nums){
			System.out.println(n);
		}
	}
}