class Student extends Person {
	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here
	public String calculate() {
		int sum = 0;
		for (int i : testScores) {
			sum += i;
		}
		int average = sum / testScores.length;
		String grade = null;

		if (average <= 100 && average >= 90) {
			grade = "O";
		}
		if (average < 90 && average >= 80) {
			grade = "E";
		}
		if (average < 80 && average >= 70) {
			grade = "A";
		}
		if (average < 70 && average >= 55) {
			grade = "P";
		}
		if (average < 55 && average >= 40) {
			grade = "D";
		}
		if (average < 40) {
			grade = "T";
		}
		return grade;

	}
}