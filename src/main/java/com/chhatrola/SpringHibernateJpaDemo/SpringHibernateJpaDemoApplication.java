package com.chhatrola.SpringHibernateJpaDemo;

import com.chhatrola.SpringHibernateJpaDemo.controller.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateJpaDemoApplication {

	@Autowired
	PersonController personController;

	@Autowired
	StudentController studentController;

	@Autowired
	CourseController courseController;


	@Autowired
	NamedQuriesController namedQuriesController;

	@Autowired
	StudentSpringDataJpaController studentSpringDataJpaController;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaDemoApplication.class, args);
	}

	@Bean
	public String test(){
		personController.personOps();
		studentController.studentOps();
		courseController.courseOps();
		namedQuriesController.doNamedQueryOps();
		studentSpringDataJpaController.doSpringDataJpaOps();
		return "";
	}


}
