import java.util.*;

public class Student {

    // Fields
    private String studName;
    private int age;
    private double gpa;

    // Constructor
    public Student(String studName, int age, double gpa) {
        this.studName = studName;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters
    public String getStudName() {
        return studName;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Display student info
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studName);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();

        // Add students to the list
        studentList.add(new Student("Alice", 20, 3.8));
        studentList.add(new Student("Bob", 22, 3.5));
        studentList.add(new Student("Charlie", 21, 3.9));


    }
}
