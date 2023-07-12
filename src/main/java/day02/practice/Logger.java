package day02.practice;

public class Logger {
	public static void debug(String msg) {
		System.out.println("DEBUG: " + msg);
	}

	public static void info(String msg) {
		System.out.println("INFO: " + msg);
	}

	public static void error(String msg) {
		System.out.println("ERROR: " + msg);
	}

	public static void debug(int num) {
		System.out.println("DEBUG: " + num);
	}

	public static void info(int num) {
		System.out.println("Info: " + num);
	}
	
	public static void error(int num) {
		System.out.println("Error: " + num);
	}

	public static void main(String[] args) {
		debug("Debuggging loading...");
		info("Info loading...");
		error("Error loading...");
		debug(5);
		info(6);
		error(8);
		

	}
}
