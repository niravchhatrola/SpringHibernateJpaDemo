package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by niv214 on 26/4/20.
 */
@Repository
public class StudentRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Student getStudentById(Long id){
        return entityManager.find(Student.class, id);
    }


}
