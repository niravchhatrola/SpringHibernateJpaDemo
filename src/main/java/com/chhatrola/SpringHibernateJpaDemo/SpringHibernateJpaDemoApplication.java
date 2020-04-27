package com.chhatrola.SpringHibernateJpaDemo;

import com.chhatrola.SpringHibernateJpaDemo.controller.CourseController;
import com.chhatrola.SpringHibernateJpaDemo.controller.PersonController;
import com.chhatrola.SpringHibernateJpaDemo.controller.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringHibernateJpaDemoApplication {

	@Autowired
	PersonController personController;

	@Autowired
	StudentController studentController;

	@Autowired
	CourseController courseController;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaDemoApplication.class, args);
	}

	@Bean
	public String test(){
		personController.personOps();
		studentController.studentOps();
		courseController.courseOps();
		return "";
	}


}
