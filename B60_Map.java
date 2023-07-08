// Map
import java.util.Map;
import java.util.HashMap;
import java.util.HashTable;
public class B60_Map{
	public static void main(String[] args){
		Map<String, Integer> students = new HashMap<>();
		students.put("Raman", 56);
		students.put("Harsh", 67);
		students.put("Kiran", 92);
		students.put("Sushil", 67);
		students.put("Harsh", 45);	
		System.out.println(students);
		System.out.println(students.get("Harsh"));
		System.out.println(students.keySet());
		for(String key: student.keySet()){
			System.out.println(key + " : " + students.get(key));
		}

		Map<String, Integer> students1 = new HashTable<>();
		students1.put("Raman", 56);
		students1.put("Harsh", 67);
		students1.put("Kiran", 92);
		students1.put("Sushil", 67);
		students1.put("Harsh", 45);	
		System.out.println(students1);
		System.out.println(students1.get("Harsh"));
		System.out.println(students1.keySet());
		for(String key: students1.keySet()){
			System.out.println(key + " : " + students1.get(key));
		}

	}
}