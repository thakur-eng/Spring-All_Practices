package SpringEx.SpringSecond;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {



		@Bean("student")
		public Student createstudent() {
			Student student = new Student();
			student.setCollage("Gurukul");
			student.setStudentName("Ramchandr ji");
			student.setStudentAge(25);
			return student;
		}

		@Bean("address")
		public Address createaddress() {
			Address address = new Address();
			address.setStudentAddress("Ayodhya");
			address.setStudentFather("Dashrath");
			address.setStudentMother("Kosaliya");

			return address;

		}

	}

