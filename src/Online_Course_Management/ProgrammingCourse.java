package Online_Course_Management;

import java.util.ArrayList;
import java.util.List;

class ProgrammingCourse extends Course {
    List<String> enrolledStudents = new ArrayList<>();

    public ProgrammingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
        System.out.println("Student " + studentName + " enrolled in Programming Course");
    }
}