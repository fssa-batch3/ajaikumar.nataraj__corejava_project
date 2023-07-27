package day12.practice;

import java.util.List;

import day11.practice.DAOException;

public class MainExcute {

	public static void main(String[] args) throws DAOException {
		TaskDAO taskDAO = new TaskDAO();

		
		Task newTask = new Task();
		newTask.id = 11;
		newTask.name = "Learn FacePREP";
		newTask.status = "Waiting for Coach";
		taskDAO.createTask(newTask);

	
		Task existingTask = new Task();
		existingTask.id = 1;
		existingTask.name = "Learn Java";
		existingTask.status = "Wait for teaching";
		taskDAO.updateTask(existingTask);

		
		int taskIdToDelete = 1;
		taskDAO.deleteTask(taskIdToDelete);

	
		try {
			List<Task> allTasks = taskDAO.getAllTasks();
			for (Task task : allTasks) {
				System.out.println("ID: " + task.id + ", Name: " + task.name + ", Status: " + task.status);
			}
		} catch (DAOException e) {
			System.err.println(e.getMessage());
		}
	}

}