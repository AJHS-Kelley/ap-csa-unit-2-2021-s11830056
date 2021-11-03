import java.util.Scanner;
// Creating Classes and methods v1.5

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
    this.studentName =studentName;
}


    
    
}
