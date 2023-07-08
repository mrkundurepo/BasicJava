// Finally
public class B52_Finally{
	public static void main(String[] args){
		int i = 0;
		int j = 0;
		try{
			j=18/i;
		} catch(Exception e){
			System.out.println("Something went wrong");
		} finally {
			System.out.println("Bye");
		}

		int num = 0;
		BufferedReader bf = null;
		try{
			InputStreamReader in = new InputStreamReader(System.in);
			bf = new BufferedReader(in);
			num = Integer.parseInt(bf.readLine());
			System.out.println(num);
		}
		finally {
			bf.close();
			System.out.println("Bye");
		}
		num = 0;
		try (BufferedReader br = new BufferedReader(new InoutStreamReader(System.in))){
			num = Integer.parseInt(br.readLine());
			System.out.println(num);
		}
	}
}