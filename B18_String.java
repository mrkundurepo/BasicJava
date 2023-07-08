// Strings
public class B18_String{
	public static void main(String[] args){
		String name = "narine";
		String tellName = new String("narine");
		System.out.println(tellName);
		System.out.println(tellName.hashCode());
		System.out.println("hello " + tellName);
		System.out.println(tellname.charAt(1));
		System.out.println(tellname.concat("reddy"));

		// Mutable and immutable
		String name = "narine";
		name = name + "reddy";
		System.out.println("hello "+name);
		String s1 = "Narine";
		String s2 = "Narine";
		System.out.println(s1==s2);

		// String Buffer
		StringBuffer sb = new StringBuffer("Navin");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" Reddy");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.insert(6,"Java ");
		System.out.println(sb);
		sb.setLength(30);
		System.out.println(sb);
		sb.ensureCapacity(100);
		System.out.println(sb);
	}
}