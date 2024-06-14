package lesson10.Prob1;

import java.util.HashMap;
import java.util.List;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> map = new HashMap<>();
		for(Student student : students) {
			Key k = new Key(student.getFirstName(), student.getLastName());
			map.put(k, student);
		}
		return map;
	}
}
