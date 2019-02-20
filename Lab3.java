package package1;

import java.util.Date;

/*
 * Andrew Reny 
 * This program simply displays the current amount of available memory to the user in bytes.
 */
public class Lab3 {
	
	public static void getMemory() {
		long memory = Runtime.getRuntime().maxMemory();
		  System.out.println("Maximum memory (bytes): " + 
		  (memory == Long.MAX_VALUE ? "no limit" : memory));
	}
	public static void getCurrentDate() {
		Date date = new Date(); 
		System.out.print("Current date: " + date); 
	}
	

	public static void main(String [] args) {
		getMemory();
		getCurrentDate();
	}
	
}
