package Online_Course_Management;

public class MainCourseManagement {
    public static void main(String[] args) {
        ProgrammingCourse javaCourse = new ProgrammingCourse("Java Programming", 40);
        DesignCourse uxCourse = new DesignCourse("UX Design", 30);

        javaCourse.enrollStudent("Alice");
        uxCourse.enrollStudent("Bob");

        System.out.println();
        javaCourse.showCourseDetails();
        System.out.println();
        uxCourse.showCourseDetails();
    }
}