package com.chhatrola.SpringHibernateJpaDemo.service;

import com.chhatrola.SpringHibernateJpaDemo.model.Course;
import com.chhatrola.SpringHibernateJpaDemo.model.Passport;
import com.chhatrola.SpringHibernateJpaDemo.model.Student;
import com.chhatrola.SpringHibernateJpaDemo.repository.CourseRepository;
import com.chhatrola.SpringHibernateJpaDemo.repository.PassportRepository;
import com.chhatrola.SpringHibernateJpaDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by niv214 on 26/4/20.
 */
@Service
@Transactional
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PassportRepository passportRepository;

    @Autowired
    CourseRepository courseRepository;

    public void doStudentDbOps(){

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------ONE to ONE bidirectional------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("----------------------------------Get Student and than get passport----------------------------------------------------");

        Student studentById = studentRepository.getStudentById(1001l);

        System.out.println(studentById);

        System.out.println(studentById.getPassport());

        System.out.println("--------------------------------------------------------------------------------------");


        System.out.println("----------------------------------Get Passport and than get student----------------------------------------------------");

        Passport passportById = passportRepository.getPassportById(10001l);

        System.out.println(passportById);

        System.out.println(passportById.getStudent());

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public void doManyToManyDbOps(){

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------Many to Many bidirectional------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("--------------------------------get student and related courses------------------------------------------");

        Student studentById = studentRepository.getStudentById(1001l);
        System.out.println(studentById);
        System.out.println(studentById.getCourses());

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("--------------------------------get courses and related student------------------------------------------");

        Course courseById = courseRepository.getCourseById(10001l);
        System.out.println(courseById);
        System.out.println(courseById.getStudents());
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------------------------");

    }
}
