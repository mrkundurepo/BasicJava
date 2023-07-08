// Comparator and comparable
class Student{
	int age;
	String name;
	public Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString(){
		return "Student [age=" + age + ", name =" + name + "]";
	}
}
public class B62_Comparator{
	public static void main(String[] args){
		Comparator<Student> com = new Comparator<Student>(){
			public int compare(Student i, Student j){
				if(i.age > j.age) return 1;
				else return -1;
			}
		};
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(21,"Nareen"));
		studs.add(new Student(21,"John"));
		studs.add(new Student(21,"Parul"));
		studs.add(new Student(21,"Kiran"));
		Collections.sort(studs, com);
		for(Student s: nums){
			Student.out.println(s);
		}						
	}
}