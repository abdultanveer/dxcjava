package basics;

public class Student {
	String name; //name = partition = instance variable
	int age;
	int marks;
	boolean isElgible;
	
	static String COLLEGE_NAME = "IIT";
	
	public Student(){}//default constructor
	
	public Student(String name,int age) { //gayathri constructor
		this.name = name;
		this.age =age;			
	}
	
	public Student(String name, int age, int marks,boolean isElgible) {//mrdula
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.isElgible = isElgible;
	}
	
	
	public void setName(String name) { //name = parameter
		this.name = name;
	}
	
	public String getName() {return name;}

}
