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

    @Override
    public String toString(){
                return "Student Name: " + studName;

    }

    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();

        // Add students to the list
        studentList.add(new Student("Alice", 20, 3.8));
        studentList.add(new Student("Bob", 22, 3.5));
        studentList.add(new Student("Charlie", 21, 3.9));

        System.out.println(studentList);

    }
}

//To-Do
//--------------------------
// 1. start with sorting
// 2. say that sorting can take more than 1 parameter
// 3. go to comparable in a class
// 4. go to comparator as aclass
// 5. go to comparator as an la,,bda
// 6. go to comparator as a key extractor