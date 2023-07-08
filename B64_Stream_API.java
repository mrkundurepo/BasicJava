// Stream API need
public class B64_Stream_API{
	public static void main(String[] args){
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		int sum = 0;
		for(int i=0; i<nums.size(); i++){
			System.out.println(nums.get(i));
		}
		for (int n:nums){
			System.out.println(n);
		}

		Consume<Integer> con = new Consumer<Integer>(){
			public void accept(Integer n){
				System.out.println(n);
			}
		};
		nums.forEach(con);
	}
}