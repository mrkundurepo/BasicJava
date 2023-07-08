// B65 Stream API
public class B65_Stream_API{
	public static void main(String[] args){
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		Stream<Integer> s1 = nums.stream();
		s1.forEach(n -> System.out.println(n));
		Stream<Integer> s2 = s1.filter(n -> n%2==0);
		s2.forEach(n -> System.out.println(n));
		Stream<Integer> s3 = s2.map(n -> n*2);
		s3.forEach(n -> System.out.println(n));
		int result = s3.reduce(0,(c,e) -> c+e);
		System.out.println(result);

		List<Integer> nums2 = Arrays.asList(4,5,63,52,66,2,3,9);
		int result2 = nums2.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0,(c,e) -> c+e);
		System.out.println(result2)	
	}
}