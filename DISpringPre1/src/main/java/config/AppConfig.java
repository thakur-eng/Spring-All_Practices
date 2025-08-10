package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beens.Student;
import beens.Teacher;

@Configuration
public class AppConfig {

	@Bean
	public Student createStudent() {
		Student student = new Student();
		student.setBranch("CSIT");
		student.setCollage("C.V.Raman");
		student.setEmail("ashish@gamil.com");
		student.setName("Ashish");
		student.setTeacher(createTeacher());
		return student;

	}

	@Bean
	    public Teacher createTeacher() {
		Teacher teacher = new Teacher();
		teacher.setBranchcode("1011");
		teacher.setDepartment("CSE");
		teacher.setSpacilist("datasience");
		return teacher;
	}

}