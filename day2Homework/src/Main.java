public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",29.90,"Engin Demiroğ");
        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)",29.90,"Engin Demiroğ");
        Course course3 = new Course("Programlamaya Giriş için Temel Kurs",0,"Engin Demiroğ");

        CourseManager courseManager = new CourseManager();
        courseManager.addToCourse(course1);
        courseManager.addToCourse(course2);
        courseManager.delToCourse(course3);

        courseManager.courseInfo(course3);

        Course[] courses ={course1,course2};

        System.out.println(courses.length);
    }
}
