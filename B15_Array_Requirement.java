// Array Requirement
public class B15_Array_Requirement{
	public static void main(String[] args){
		int nums[] = {5,6,3,8};
		System.out.println(nums[1]);
		nums[1] = 60;
		System.out.println(nums[1]);

		// Dynamic array
		int num1[] = new int[4];
		System.out.println(num1[1]);
		num1[0] = 4;
		num1[1] = 8;
		num1[2] = 3;
		num1[3] = 5;		
		System.out.println(num1[0]);
		for(int i=0; i<5; i++){
			System.out.println(num1[i]);
		}
	}
}