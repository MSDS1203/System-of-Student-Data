/*
 * Marian Sousan 
 * Student class for constructors and get/set/search methods for variables 
 */
package assg4_sousanm22;

public class Student {
	private String id;
	private String name;
	private char gender;
	private String DateOfBirth;
	private String major;
	
	/**
	 * default constructor 
	 */
	public Student() {
		id = "Empty"; 
		name = "Empty";
		gender = (Character) null;
		DateOfBirth = "Empty";
		major = "Undeclared";
	}
	
	/**
	 * constructor, takes the following and uses to initialize
	 * @param ID
	 * @param n
	 * @param g
	 * @param DOF
	 */
	public Student(String ID, String n, char g, String DOF) {
		id = ID; 
		name = n;
		gender = g;
		DateOfBirth = DOF;
		major = "Undeclared";
	}
	
	/**
	 * constructor, takes input and assigns a value to all variables
	 * @param ID
	 * @param n
	 * @param g
	 * @param DOF
	 * @param m
	 */
	public Student(String ID, String n, char g, String DOF, String m) {
		id = ID; 
		name = n;
		gender = g;
		DateOfBirth = DOF;
		major = m;
	}
	
	/**
	 * searches student by id 
	 * @param arr
	 * @param num
	 * @return
	 */
	
	/**
	 * get method for ID
	 * @return
	 */
	public String getID() {
		return id;
	}
	
	/**
	 * get method for name of student
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * get method for date of birth 
	 * @return
	 */
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	/**
	 * get method for gender 
	 * @return
	 */
	public char getGender() {
		return gender;
	}
	
	/**
	 * return method for major 
	 * @return
	 */
	public String getMajor() {
		return major; 
	}
	
	/**
	 * set major method. equals major to newMajor
	 * @param newMajor
	 */
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	
	/**
	 * toString function, presents in proper format 
	 */
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nGender: " + gender + 
				"\nDate of birth: " + DateOfBirth + "\nMajor: " + major;
	}
	
	/**
	 * Searches for student by name given by user, if not found, throws exception 
	 * @param arr
	 * @param used
	 * @param stuName
	 * @return
	 * @throws StudentNotFoundException
	 */
	public static int StudentSearchByName(Student arr[], int used, String stuName) throws StudentNotFoundException  {
		for(int i = 0; i<used; i++) {
			if(arr[i].name.equals(stuName)) {
				return i;
			}
		}
		throw new StudentNotFoundException("Cannot find student!");	
	}
	
	/**
	 * Searches for student by ID, if not found, throws exception 
	 * @param arr
	 * @param used
	 * @param numId
	 * @return
	 * @throws StudentNotFoundException
	 */
	public static int StudentSearchById(Student arr[], int used, String numId) throws StudentNotFoundException{
		//System.out.println("Searching for ID: " + numId);
			for(int i = 0; i<used; i ++)
			{
				// System.out.println("Checking ID: " + arr[i].id);
				if(arr[i].id.equals(numId)){
					return i;
				}
			}
				throw new StudentNotFoundException("Cannot find student!");
	}
	
}
