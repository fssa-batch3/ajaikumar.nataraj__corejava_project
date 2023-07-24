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
            "IT,Basker",
            "HR,Ram",          
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

        // Generate output using keySet()
        for (String department : departmentMap.keySet()) {
            List<String> employees = departmentMap.get(department);

            String employeeList = String.join(", ", employees);
            System.out.println(department + ": " + employeeList);
        }
    }
}


