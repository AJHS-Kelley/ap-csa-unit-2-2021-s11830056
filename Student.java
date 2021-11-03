import java.util.Scanner;
// Creating Classes and methods v2,0

public class Student {
    private int studentID;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;




public Student() {
    this.studentID = 0;
    this.gradeLevel = 0;
    this.gradePointAvg = 0.0;
    this.studentName = "";
    }

public Student (int studentID, int gradeLevel, double GPA, String studentName) {
    this.studentID = studentID;
    this.gradeLevel = gradeLevel;
    this.gradePointAvg = GPA;
    this.studentName = studentName;
}

public Student(int studentID, String studentName) {
this.studentID = studentID;
this.studentName = studentName;
this.gradeLevel = 9;
this.gradePointAvg = 4.0;    
}

public static void main(String[] args) {
    Student student0 = new Student();
    Student student1 = new Student(12345678, 11, 0.57, "Dr.Strange");




}
    
}
