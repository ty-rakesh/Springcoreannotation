package com.te.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springannotationdemo.beans.Student;
import com.te.springannotationdemo.config.StudentConfig;


public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
       Student student=context.getBean(Student.class);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
	}


}
