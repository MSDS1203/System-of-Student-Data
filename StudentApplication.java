/* Marian Sousan
 * Student application, includes main method and creates an array of students. 
 */
package assg4_sousanm22;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class StudentApplication {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Scanner inputStream = null; 
		
		// temporarily hold the users answer & line collects the next line being read & used is for the amount of the array used
		String line, name, major, ID;
		int choice, used = 0, index = 0;
		
		
		Student storage[] = new Student[100]; // Initializes storage of student array 
		
		try {
			inputStream = new Scanner(new File("Assg4_input.txt"));
		}
		catch (IOException e ) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		for(int i = 0; i<100 && inputStream.hasNextLine();  i++) {
			line = inputStream.nextLine();
				String[] elements = line.split(",", 0);
				if(elements.length == 4) {
					storage[i] = new Student(elements[0], elements[1], elements[2].charAt(0), elements[3]);
				}
				else {
					storage[i] = new Student(elements[0], elements[1], elements[2].charAt(0), elements[3], elements[4]);
				}
			used++;
		}
		inputStream.close();
		
		// Display all student information 
		System.out.println("***WELCOME***\nList of all current students:\n");
		for(int i = 0; i<used; i++) {
			System.out.println(storage[i].toString() + "\n");
		}
		System.out.println("Total number of students: " + used + "\n");
		
		while(true)
		{
			System.out.println("1. Search student by id\n2. Search student by name"
					+ "\n3. Change student major\n4. Exit");
			choice = kbd.nextInt();
			System.out.println();
			if(choice ==1) {
				// Searches for ID
				System.out.println("Please enter an ID: ");
				kbd.nextLine();
				ID = kbd.nextLine();
			
				try {
					index = Student.StudentSearchById(storage, used, ID);
				}
				catch(StudentNotFoundException e) {
					System.out.println(e.getMessage());
					System.exit(1);
				}
				System.out.println("\n"+storage[index].toString());
			}
			else if(choice == 2) {
				// Searches by name 
				System.out.println("Please enter a name: ");
				kbd.nextLine();
				name = kbd.nextLine();
				try {
					index = Student.StudentSearchByName(storage, used, name);
				}
				catch(StudentNotFoundException e) {
					System.out.println(e.getMessage());
					System.exit(1);
				}
				System.out.println("\n"+storage[index].toString());
			}
			else if(choice ==3) {
				// changes major
				System.out.println("Please enter an ID: ");
				kbd.nextLine();
				ID = kbd.nextLine();
				try {
					index = Student.StudentSearchById(storage, used, ID);
				}
				catch(StudentNotFoundException e) {
					System.out.println(e.getMessage());
					System.exit(1);
				}
				System.out.println("Enter a new major: ");
				major = kbd.nextLine();
				storage[index].setMajor(major);
				System.out.println("\n"+storage[index].toString());
			}
			else if(choice==4) {
				System.out.println("You have exited the system.");
				System.exit(0);
			}
			else {
				System.out.println("invalid input, try again.");
			}
			
			System.out.println();
			System.out.println();
		}
		
		
	}
}
