package day08.solved;

import java.util.HashMap;

public class LambdaExpression {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);


		// Modifying a particular count
		int hrCount = deptMap.get("HR");
		hrCount += 1;
		deptMap.put("HR", hrCount);

		// Iterate
//		System.out.println("Iterate method");
//		for (String deptName : deptMap.keySet()) {
//
//			Integer count = deptMap.get(deptName);
//			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);
//
//		}
	//	System.out.println();
		System.out.println("Lambda expression for each method");
		deptMap.forEach((a, b) -> System.out.println("Department Name:" + a + " and Employee Count :" + b));
	}
}
