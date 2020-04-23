package com.chhatrola.SpringHibernateJpaDemo.controller;

import com.chhatrola.SpringHibernateJpaDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 23/4/20.
 */
@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    public void personOps(){
        personService.doPersonDbOps();
    }
}
