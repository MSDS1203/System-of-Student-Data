package assg4_sousanm22;

public class StudentNotFoundException extends Exception {

	/**
	 * default exception handling
	 */
	public StudentNotFoundException() {
		super("Student not found");
	}
	
	/**
	 * exception handling including a message
	 * @param message
	 */
	public StudentNotFoundException(String message) {
		super(message);
	}
}
