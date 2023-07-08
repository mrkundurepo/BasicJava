// Comparator vs comparable
import java.util.*
public class B61_Comparable{
	public static void main(String[] args){
		Comparator<Integer> com = new Comparator<Integer>(){
			public int compare(Integer i, Integer j){
				if(i%10 > j%10) return 1;
				else return -1;
			}
		};
		List<Integer> nums = new ArrayList<>();
		nums.add(43);
		nums.add(31);
		nums.add(72);
		nums.add(29);
		Collections.sort(nums, com);
		System.out.println(nums);						
	}
}