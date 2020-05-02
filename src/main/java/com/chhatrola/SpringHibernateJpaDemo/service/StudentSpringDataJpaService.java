package com.chhatrola.SpringHibernateJpaDemo.service;

import com.chhatrola.SpringHibernateJpaDemo.model.Student;
import com.chhatrola.SpringHibernateJpaDemo.repository.StudentSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by niv214 on 1/5/20.
 */
@Service
public class StudentSpringDataJpaService {

    @Autowired
    StudentSpringDataJpaRepository studentSpringDataJpaRepository;

    public void doSpringDataJpaOps(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("---------------------------Spring Data Jpa Demos-----------------------------------");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("------------------------Basic operations using spring data jpa---------------------------------");

        System.out.println("***findAll*****"+studentSpringDataJpaRepository.findAll());

        Sort sort = Sort.by(Sort.Direction.DESC, "name");
        System.out.println("***findAllSortedDesc*****"+studentSpringDataJpaRepository.findAll(sort));


        System.out.println("***Count*****"+studentSpringDataJpaRepository.count());

        System.out.println("***FindAllByIds*****"+studentSpringDataJpaRepository.findAllById(Arrays.asList(Long.valueOf(1001), Long.valueOf(1002), Long.valueOf(1003))));

        PageRequest pageRequest = PageRequest.of(0, 2);
        System.out.println("***findwithPagination index *****");
        studentSpringDataJpaRepository.findAll(pageRequest).get().forEach(System.out::println);

        System.out.println("***findwithPagination index next page *****");
        studentSpringDataJpaRepository.findAll(pageRequest.next()).get().forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------");


        System.out.println("------------------------Custom operations using spring data jpa---------------------------------");

        System.out.println("*****FindById and Name***********"+studentSpringDataJpaRepository.findByNameAndId("Nirav", 1001l));

        System.out.println("*****Custome query : ***********"+studentSpringDataJpaRepository.getAllStudentWithids());

        System.out.println("*****Custome query with parameter : ***********"+studentSpringDataJpaRepository.getAllStudentWithidParameterized(1002l));

        System.out.println("*****Join Custome query with parameter : ***********"+studentSpringDataJpaRepository.getAllStudentRegestiredWithCourse("Java"));

        System.out.println("*****Join with 3 tables Custome query with parameter : ***********"+studentSpringDataJpaRepository.getAllStudentHasRegisterdCourseWithReviewRating("5"));

        System.out.println("--------------------------------------------------------------------------------");
    }
}
