package com.te.springannotationdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springannotationdemo.beans.Student;

@Configuration
public class StudentConfig {
	
	@Bean
	public Student getstudent(){
		return new Student();
	}
	
	@Bean
	@Primary
	public Student getStudent2(){
		
		Student student=new Student();
		student.setId(11);
		student.setName("ram");
		return student;
	}

}
