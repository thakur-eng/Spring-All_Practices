package SpringEx.SpringSecond;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Spring Hello World ");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       
        Student student = (Student) context.getBean("student");
        student.displayStudentDetails();
        
        Address address = (Address) context.getBean("address");
        
        address.displayAddres();
    }
}
