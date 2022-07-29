package hashSetAndHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		//HashMap<String, String> map = new HashMap<>();

//		Set<Student> rollCall = new HashSet<>();
//		
//		Student s1 = new Student(1, "Nitesh");
//		
//		
//		rollCall.add(s1);
		
		Student s1 = new Student(1, "Nitesh");
		Student s2 = new Student(1, "Ritesh");
		
		System.out.println(s1.equals(s2));
	}
	
	
}

class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return rollNo;
	}
	
	@Override
	public boolean equals(Object ob) {
		Student that = (Student)ob;
		if(this.rollNo == that.rollNo) {
			return true;
		}
		return false;
	}
}
