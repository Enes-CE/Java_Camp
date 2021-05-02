public class StudentManager extends UserManager{

    public void addCourse(Course course){
        System.out.println(course.getCourseName()+" adlı kurs hesabınıza eklendi.");
    }
}
