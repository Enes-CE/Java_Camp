public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        StudentManager studentManager = new StudentManager();
        Instructor instructor = new Instructor();
        InstructorManager instructorManager = new InstructorManager();
        Course course = new Course();
        Course course1 = new Course();
        CourseManager courseManager = new CourseManager();

        student.setName("Enes Ulusoy");
        student.setEmail("enes@gmail.com");
        student.setPassword("138953");
        student.setCertificate("Java + React certificate");
        student.setNumberOfCourse(3);

        instructor.setName("Engin Demiroğ");
        instructor.setNumberOfStudents(50000);
        instructor.setCertificate("MCT");
        instructor.setEmail("engindemiroğ@gmail.com");
        instructor.setPassword("150789");

        course1.setCourseName("C# + ANGULAR");
        course1.setCoursePrice(29.90);



        System.out.println("Create Course");
        instructorManager.createCourse(course);

        studentManager.addCourse(course1);
        courseManager.courseInfo(course1);





    }
}
