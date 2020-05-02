package com.chhatrola.SpringHibernateJpaDemo.service;

import com.chhatrola.SpringHibernateJpaDemo.repository.NamedQueriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by niv214 on 30/4/20.
 */
@Service
@Transactional
public class NamedQueriesService {


    @Autowired
    NamedQueriesRepository namedQueriesRepository;

    public void doNamedQueriesExp(){
        namedQueriesRepository.doNamedQueriesExp();
    }
}
