package com.chhatrola.SpringHibernateJpaDemo.controller;

import com.chhatrola.SpringHibernateJpaDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 26/4/20.
 */
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    public void studentOps(){
        studentService.doStudentDbOps();
        studentService.doManyToManyDbOps();
    }
}
