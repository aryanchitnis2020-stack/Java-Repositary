package info.java;

public class Student {
	String name;
	String city;
	int age;
	void addData(String n, String c, int a) {
		name = n ;
		city = c;
		age = a;
	
	}
	
	void printData() {
		System.out.println("Name: " +name);
		System.out.println("City: " +city);
		System.out.println("Age: " +age);
		
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.addData("Aryan", "Mumbai", 18);
		s2.addData("Rahul", "Pune", 19);
		
		s1.printData();
		s2.printData();
		
		// TODO Auto-generated method stub

	}
}
