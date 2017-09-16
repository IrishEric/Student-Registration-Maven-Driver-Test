import java.util.ArrayList;

import org.joda.time.DateTime;

public class TestStudentRegistrationDepenency {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("James Kiely", 22, "23/09/94");
		Student s2 = new Student("Finbarr Kiely", 21, "2/10/94");
		Student s3 = new Student("Robert Kiely", 25, "3/08/92");
		Student s4 = new Student("Michael Kiely", 20, "23/09/96");
		Student s5 = new Student("Eric McEvoy", 19, "13/09/97");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		Module m1 = new Module("CT417", "Software Engineering III", students);
		Module m2 = new Module("CS402", "Cryptography", students);
		Module m3 = new Module("CT420", "Real Time Systems", students);
		
		ArrayList<Module> modules = new ArrayList<Module>();
		modules.add(m1);
		modules.add(m2);
		modules.add(m3);
		DateTime startDate = new DateTime(2017, 9, 1, 12, 0, 0, 0);
		DateTime endDate = new DateTime(2018, 5, 28, 12, 0, 0, 0);
		CourseProgramme cp = new CourseProgramme("Computer Science & Information Technology", modules, startDate, endDate);
		cp.toString();
}
}
