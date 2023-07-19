package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, List<String>> departmentMap = new HashMap<>();

        // Sample input data
        String[] input = {
            "HR,Ram",          
            "IT,Basker",
            "HR,Suresh",
            "IT,Joseph",
            "Admin,Sundar"
        };

        // Process input data
        for (String entry : input) {
            String[] parts = entry.split(",");
            String department = parts[0].trim();
            String employee = parts[1].trim();

            List<String> employees = departmentMap.getOrDefault(department, new ArrayList<>());
            employees.add(employee);
            departmentMap.put(department, employees);
        }

        // Generate output
        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();

            String employeeList = String.join(", ", employees);
            System.out.println(department + ": " + employeeList);
        }
	}

}
