package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by niv214 on 27/4/20.
 */
@Repository
public class CourseRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Course getCourseById(Long id){
        return entityManager.find(Course.class, id);
    }

}
