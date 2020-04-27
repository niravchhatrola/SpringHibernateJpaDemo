package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Review;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by niv214 on 27/4/20.
 */
@Repository
public class ReviewRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Review getReviewById(Long id){
        return entityManager.find(Review.class, id);
    }
}
