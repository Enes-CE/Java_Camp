import java.util.Scanner;

public class InstructorManager extends UserManager{
    Scanner scanner = new Scanner(System.in);

    public void createCourse(Course course){
        System.out.println("Oluşturulacak kursun adı : ");
        String course_Name = scanner.nextLine();
        System.out.println("Oluşturulacak kursun fiyatı : ");
        int price = scanner.nextInt();
        System.out.println("Oluşturulacak kursun süresi : ");
        int day = scanner.nextInt();
        System.out.println(course_Name+" adlı kurs oluşturuldu...");
    }

}
