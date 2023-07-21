package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task> {
	int id;
	String name;
	LocalDate deadline;

	Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
	public LocalDate getDeadLine() {
		return deadline;
	} 
	
	@Override
	public String toString() {
		return "[" +  id + ", " + name + ", " + deadline + "]";
	}

	@Override
	public int compareTo(Task task) {
		return this.deadline.compareTo(task.getDeadLine());

	}
	
	
}

public class DeadlineSorting {

	public static void main(String[] args) {
		ArrayList<Task> arr = new ArrayList<Task>();
		{
			arr.add(new Task(3, "Coding", LocalDate.of(2022, 05, 21)));
			arr.add(new Task(3, "Coding", LocalDate.of(2022, 04, 21)));
			arr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));
			arr.add(new Task(5, "Product Design", LocalDate.of(2022, 10, 01)));
			arr.add(new Task(1, "Software Design", LocalDate.of(2022, 10, 07)));
			arr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));
			

			System.out.println(arr);
			
			Collections.sort(arr);
			System.out.println(arr);
		}
	}

}
