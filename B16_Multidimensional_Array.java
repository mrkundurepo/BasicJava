// Multidimensional Array
public class B16_Multidimensional_Array{
	public static void main(String[] args){
		int nums[][] = new int[3][4];
		// Fill multidimensional array
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				num[i][j] = (int)(Math.random()*100);
				System.out.println(nums[i][j]);
			}
		for(int i<=0; i<3; i++){
			for(int j=0;j<4;j++){
				System.out.println(nums[i][j] + " ");
			}
			System.out.println();
		}


		// Jagged (different number of columns)
		int nums[][] = new int[3][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[2];
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums[i].length; j++){
				num[i][j] = (int)(Math.random()*100);
			}			
		// Enhanced loop;
		for(int n[]: nums){
			for(int m: n){
				System.out.println(m + " ");
			}
			System.out.println();
		}

		// 3D arrays
		int nums[][][] = new int[3][4][5];
		// Array of Not-a-object
		int nums[] = num int[6];
		nums[0]=4;
		nums[1]=9;
		nums[2]=4;
		nums[3]=6;
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
	}
}