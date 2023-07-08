// Set
import java.util.Set;
import java.util.HashSet;
public class B59_Set{
	public static void main(String[] args){
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(62);
		nums.add(54);
		nums.add(82);
		nums.add(21);
		nums.add(62);
		for(int n:nums){
			System.out.println(n);
		}
		Set<Integer> nums2 = num TreeSet<Integer>();
		nums2.add(62);
		nums2.add(54);
		nums2.add(82);
		nums2.add(21);
		nums2.add(62);
		for(int n:nums){
			System.out.println(n);
		}
		Collection<Integer> nums3 = new TreeSet<Integer>();
		nums3.add(62);
		nums3.add(54);
		nums3.add(82);
		nums3.add(21);
		nums3.add(62);
		for(int n:nums){
			System.out.println(n);
		}
		// Iterables
		Collection<Integer> nums4 = new TreeSet<Integer>();
		nums4.add(62);
		nums4.add(54);
		nums4.add(82);
		nums4.add(21);
		nums4.add(62);
		Iterator<Integer> values = nums4.iterator();
		while(values.hasNext()){
			System.out.println(values.next());
		}
	}
}