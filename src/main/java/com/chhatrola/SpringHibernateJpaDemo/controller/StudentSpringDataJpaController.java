package com.chhatrola.SpringHibernateJpaDemo.controller;

import com.chhatrola.SpringHibernateJpaDemo.repository.StudentSpringDataJpaRepository;
import com.chhatrola.SpringHibernateJpaDemo.service.StudentSpringDataJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by niv214 on 1/5/20.
 */
@Controller
public class StudentSpringDataJpaController {

    @Autowired
    StudentSpringDataJpaService studentSpringDataJpaService;

    public void doSpringDataJpaOps(){
        studentSpringDataJpaService.doSpringDataJpaOps();
    }
}
