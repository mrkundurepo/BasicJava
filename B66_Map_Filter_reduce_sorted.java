// Map filter reduce sorted
public class B66_Map_Filter_reduce_sorted{
	public static void main(String[] args){
		List<Integer> nums2 = Arrays.asList(4,5,6,3,6,2,5,,3,7,9);
		int result2 = nums2.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0,(c,e) -> c+e);
		System.out.println(result2);

		List<Integer> nums = Arrays.asList(4,5,6,3,6,2,5,,3,7,9);
		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer t){
				if(n%2 == 0){
					return true;
				} else {
					return false;
				}	
			}
		};
		// Predicate<Integer> p = n -> n%2 = 0;
		Function<Integer, Integer> fun = new Function<Integer, Integer>(){
			public Integer apply(Integer n){
				return n*2;
			}
		};
		// Function<Integer, Integer> fun = n -> n*2;
		int result = nums.stream().filter(p).map(fun).reduce(0,(c,e)-> c+e); 

		Stream<Integer> sortedValues = nums.stream().filter(n -> n%2==0).sorted();
		sortedValues.forEach(n->System.out.println(n));

		// multi-thread
		Stream<Integer> sortedValues2 = nums.parallelStream().filter(n->n%2==0).sorted();
		sortedValues.forEach(n -> System.out.println(n));
	}
}