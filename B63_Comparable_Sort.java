// Comparable Sort
class Student implements Comparable<Student>{
	int age;
	String name;
	public Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString(){
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public int compareTo(Student that){
		if(this.age > that.age) return 1;
		else return -1;
	}
}
public class B63_Comparable_Sort{
	public static void main(String[] args){
		Comparator<Student> com = (i,j) -> i.age > j.age?1:-1;
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(21, "Narine"));
		studs.add(new Student(12, "John"));
		studs.add(new Student(18, "Parul"));
		studs.add(new Student(20, "Kiran"));
		Collections.sort(studs);
		for(Student s: nums){
			System.out.println(s);
		}						
	}
}