package info.java;
class Student {
    String name;

    
    Student() {
        name = "Unknown";
    }

    
    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Aryan");

        s1.display();
        s2.display();
        s3.display();
    }
}




		// TODO Auto-generated method stub
	


