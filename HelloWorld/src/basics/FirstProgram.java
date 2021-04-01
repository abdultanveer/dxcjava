package basics;

/**
 * This is my first java class 
 * @author Admin
 *
 */
public class FirstProgram {

	private static boolean isElgible(int age) {
		if(age > 18) return true;
		else return false;
	}

	public static void main(String[] args) {
		Student abdul;
		Student myStudent = new Student("abdul",888); //gayathri constructor is called
		System.out.println("name is"+myStudent.name + " age is"+myStudent.age);
		
		Student otherStudent = new Student("studentsname",345,678,false);//mrudula
		
		abdul = new Student();
		abdul.setName("tanveer");
		//abdul.name = "ansari";
		abdul.age = 123;
		abdul.isElgible = true;
		abdul.marks = 456;
		
		System.out.println(abdul.getName());
		System.out.println(Student.COLLEGE_NAME);
		
		/*int number = 20;

		printDigit(number);
		
		printNos();*/

	}

	/**
	 * this method prints ten nos
	 */
	private static void printNos() {
		for(int i=0; i<=10; i++) { //this is a single line comment
			System.out.println(i);
		}
		/*
		 * this is a multiline comment
		 */
	}

	/**
	 * this will print the digit is alphabets
	 * @param number the number
	 */
	private static void printDigit(int number) {
		switch (number) {
		case 10:
			System.out.println("ten");
			break;

		case 20:
			System.out.println("twenty");

			break;
		case 30:
			System.out.println("thirty");

			break;
		}
	}

}
