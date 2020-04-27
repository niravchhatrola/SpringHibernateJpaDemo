package com.chhatrola.SpringHibernateJpaDemo.controller;

import com.chhatrola.SpringHibernateJpaDemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 27/4/20.
 */
@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    public void courseOps(){
        courseService.doCourseDbOps();
    }
}
