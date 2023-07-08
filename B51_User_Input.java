// User Input using buffer reader and scanner
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ImputStreamReader;
import java.util.Scanner;
public class B51_User_Input{
	public static void main(String[] args) throws IOException{
		System.out.println("Enter the number");
		int num = System.in.read();
		System.out.println("ASCII: " + num);
		System.out.println(num - 48);
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		num = Integer.parseInt(bf.readLine());
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println(num);
	}
}
