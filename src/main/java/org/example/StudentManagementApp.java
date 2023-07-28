import java.util.Stack;

class Student {
    private String name;
    private int age;
    private String rollNumber;
        private String new;


    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();

        // Add students to the stack
        studentStack.push(new Student("John Doe", 20, "A001"));
        studentStack.push(new Student("Jane Smith", 19, "A002"));
        studentStack.push(new Student("Mark Johnson", 21, "A003"));

        // Print the details of all students in the stack
        System.out.println("Students in the stack:");

        for (Student student : studentStack) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println();
        }

        // Remove the top student from the stack
        Student removedStudent = studentStack.pop();
        System.out.println("Removed Student:");
        System.out.println("Name: " + removedStudent.getName());
        System.out.println("Age: " + removedStudent.getAge());
        System.out.println("Roll Number: " + removedStudent.getRollNumber());
    }
}

