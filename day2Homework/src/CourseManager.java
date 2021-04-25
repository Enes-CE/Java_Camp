public class CourseManager {

    public void addToCourse(Course course){
        System.out.println(course.courseName+" course added");
    }

    public void delToCourse(Course course){
        System.out.println(course.courseName+" course deleted");
    }

    public void courseInfo(Course course){
        System.out.println("Course name : "+course.courseName);
        System.out.println("Course price : "+course.coursePrice);
        System.out.println("Course instructor : "+course.instructor);
    }
}
