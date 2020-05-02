package com.chhatrola.SpringHibernateJpaDemo.controller;

import com.chhatrola.SpringHibernateJpaDemo.service.NamedQueriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 30/4/20.
 */
@Controller
public class NamedQuriesController {

    @Autowired
    NamedQueriesService namedQueriesService;

    public void doNamedQueryOps(){
        namedQueriesService.doNamedQueriesExp();
    }
}
