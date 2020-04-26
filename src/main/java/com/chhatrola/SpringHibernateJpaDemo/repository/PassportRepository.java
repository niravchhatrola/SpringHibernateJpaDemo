package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Passport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by niv214 on 26/4/20.
 */
@Repository
public class PassportRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Passport getPassportById(Long id){
        return entityManager.find(Passport.class, id);
    }

}
