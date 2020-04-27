package com.chhatrola.SpringHibernateJpaDemo.service;

import com.chhatrola.SpringHibernateJpaDemo.model.Course;
import com.chhatrola.SpringHibernateJpaDemo.model.Review;
import com.chhatrola.SpringHibernateJpaDemo.repository.CourseRepository;
import com.chhatrola.SpringHibernateJpaDemo.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by niv214 on 27/4/20.
 */
@Service
@Transactional
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    ReviewRepository reviewRepository;

    public void doCourseDbOps(){
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------ONE to Many------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("----------------------------------Get Course and related reviews----------------------------------------------------");

        Course courseById = courseRepository.getCourseById(10001l);
        System.out.println(courseById);
        System.out.println(courseById.getReviews());

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------Many to One------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");


        System.out.println("----------------------------------Get Review  and related Course----------------------------------------------------");

        Review reviewById = reviewRepository.getReviewById(1005l);
        System.out.println(reviewById);
        System.out.println(reviewById.getCourse());

        System.out.println("--------------------------------------------------------------------------------------");

    }
}
