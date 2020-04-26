package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by niv214 on 23/4/20.
 */
@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(Long id){
        return entityManager.find(Person.class, id);
    }

    public Person insert(Person person){
        entityManager.persist(person);
        return person;
    }

    public Person update(Person person){
        return entityManager.merge(person);
    }

    public void deleteById(Long id){
        entityManager.remove(findById(id));
    }

    public List<Person> findAll(){
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
        return namedQuery.getResultList();
    }

    public List<Person> findAllPunekars(){
        return entityManager.createNamedQuery("find_all_punekar", Person.class).setParameter(1, "Pune").getResultList();
    }

    public List<Person> findPerLocation(String loc){
        return entityManager.createNamedQuery("find_per_loc", Person.class).setParameter("loc", loc).getResultList();
    }

    public List<Person> findByNativeQuery(){
        return entityManager.createNativeQuery("select * from Person where name = ?", Person.class).setParameter(1, "Hardik").getResultList();
    }

    public List<Person> findByNativeQueryByAttribute(String name){
        return entityManager.createNativeQuery("select * from Person where name = :name", Person.class).setParameter("name", name).getResultList();
    }

    public void playWithEm(){
        Person person = new Person("Nirav", "Amdavad", new Date());
        entityManager.persist(person);    // It will create person record

        person.setLocation("Pune");   // it will update person record

        entityManager.flush();   // it will flush above transactions in db


        person.setLocation("Morbi");

        entityManager.refresh(person);   // it will refresh value to Pune as Gandhinagar is not yet been updated to database

        entityManager.flush();  // it will not update location to morbi

        person.setLocation("Gandhinagar");

        entityManager.flush();   // it will update location to Gandhinagar

        entityManager.detach(person);   // detach object from persistance context
        person.setName("chhatron");   // it will not be updated as object is detached

    }


}
