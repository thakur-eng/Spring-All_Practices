package SpringXml.SpringXmlDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String configFile = "SpringXml\\SpringXmlDemo\\ApplicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);

		Employee emp = (Employee) context.getBean("myEmpObj");
		emp.displayemp();
	}
}
