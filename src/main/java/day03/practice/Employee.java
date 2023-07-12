package day03.practice;

public class Employee {
	
	private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getString() {
    	return name;
    }
    
    public int getInt() {
    	return id;
    }
 
    public class TestEmployee {
     
        public static void main(String[] args) {
            Employee e1 = new Employee(1, "naresh"); 
            Employee e2 = new Employee(2, "suresh");
            
            System.out.println("id=" + e1.getInt() + ", name=" + e1.getString());
            System.out.println("id=" + e2.getInt() + ", name=" + e2.getString());
            
        }
    }

}
