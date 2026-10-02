class Student {
    protected int studentId;
    protected String name;
    protected int age;
    protected String course;

    Student(int studentId, String name, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayStudentDetails() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Course     : " + course);
    }
}

class UndergraduateStudent extends Student {
    private int semester;

    UndergraduateStudent(int studentId, String name, int age,
                         String course, int semester) {
        super(studentId, name, age, course);
        this.semester = semester;
    }

    void displayDetails() {
        System.out.println("\n--- Undergraduate Student ---");
        displayStudentDetails();
        System.out.println("Semester   : " + semester);
        System.out.println("Status     : Undergraduate");
    }
}

class GraduateStudent extends Student {
    private String specialization;

    GraduateStudent(int studentId, String name, int age,
                    String course, String specialization) {
        super(studentId, name, age, course);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("\n--- Graduate Student ---");
        displayStudentDetails();
        System.out.println("Specialization : " + specialization);
        System.out.println("Status         : Graduate");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        UndergraduateStudent student1 =
                new UndergraduateStudent(
                        101,
                        "Aryan",
                        19,
                        "B.Tech Computer Science",
                        3
                );

        GraduateStudent student2 =
                new GraduateStudent(
                        201,
                        "Rahul",
                        23,
                        "M.Tech Computer Science",
                        "Artificial Intelligence"
                );

        student1.displayDetails();
        student2.displayDetails();
    }
}
