class Person {
	protected String firstName;
	protected int idNumber;
	protected String lastName;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}
