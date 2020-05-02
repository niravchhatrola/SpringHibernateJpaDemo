package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Course;
import com.chhatrola.SpringHibernateJpaDemo.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by niv214 on 30/4/20.
 */
@Repository
public class NamedQueriesRepository {


    @PersistenceContext
    EntityManager entityManager;

    public void doNamedQueriesExp(){

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("---------------------------Named Queries Demos-----------------------------------");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("------------------------Get students who does not have registered for any courses---------------------------------");

        List<Student> studentNotRegesteredForAnyCourse = entityManager.createQuery("Select s from Student s where s.courses is Empty", Student.class).getResultList();
        System.out.println(studentNotRegesteredForAnyCourse);

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("------------------------Get courses that does not have any students---------------------------------");

        List<Course> courseswithoutstudents = entityManager.createQuery("Select c from Course c where c.students is Empty", Course.class).getResultList();
        System.out.println(courseswithoutstudents);

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("------------------------Course that does have more than two reviews---------------------------------");

        List<Course> courseswithtworeviews = entityManager.createQuery("Select c from Course c where size(c.reviews) >= 2", Course.class).getResultList();
        System.out.println(courseswithtworeviews);

        System.out.println("--------------------------------------------------------------------------------");





    }


}
