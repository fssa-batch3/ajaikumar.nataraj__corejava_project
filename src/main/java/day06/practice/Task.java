package day06.practice;

import java.util.ArrayList;

public class Task {

	public String taskName;
    public int priority;
	
	public Task(String taskName,int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}
	
	public String toString() {
		return "Task Name : " + taskName +" Priority : " + priority + "\n";
	}
	
	
	public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("learn Core Java ", 3));
        tasks.add(new Task("Lunch ", 1));
        tasks.add(new Task("FacePrep ", 3));
        System.out.println(tasks);
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
