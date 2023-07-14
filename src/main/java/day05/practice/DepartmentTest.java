package day05.practice;

public class DepartmentTest {
	public static void main(String[] args) {
        Department department = new Department("Commerce", 678);
        Student student = new Student("Ajaikumar", 202, department);
        System.out.println(student);
    }
}
