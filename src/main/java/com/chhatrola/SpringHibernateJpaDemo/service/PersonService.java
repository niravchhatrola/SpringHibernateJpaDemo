package com.chhatrola.SpringHibernateJpaDemo.service;

import com.chhatrola.SpringHibernateJpaDemo.model.Person;
import com.chhatrola.SpringHibernateJpaDemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by niv214 on 23/4/20.
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void doPersonDbOps(){
        System.out.println("---------------------findAll---------------------------");
        List<Person> all = personRepository.findAll();
        all.forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------findById---------------------------");

        Person byId = personRepository.findById(51L);
        System.out.println(byId);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------insert---------------------------");

        Person insert = personRepository.insert(new Person("Bav", "Pune", new Date()));
        System.out.println(insert);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------Update---------------------------");
        personRepository.findAll().forEach(System.out::println);

        insert.setName("niu");
        personRepository.update(insert);
        System.out.println("***** After Update");

        personRepository.findAll().forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------deleteById---------------------------");

        personRepository.findAll().forEach(System.out::println);

        personRepository.deleteById(insert.getId());
        System.out.println("***** After delete");

        personRepository.findAll().forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------Play with Entity Manager---------------------------");

        personRepository.playWithEm();

        System.out.println("------------------------------------------------");

        System.out.println("---------------------Named Query : find all punekar---------------------------");

        List<Person> allPunekars = personRepository.findAllPunekars();
        allPunekars.forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------Named Query : find per location---------------------------");

        List<Person> locs = personRepository.findPerLocation("Morbi");
        locs.forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------Native Query : find By Name---------------------------");

        List<Person> nativeQuery1 = personRepository.findByNativeQuery();
        nativeQuery1.forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("---------------------Native Query : find By Name with attribute---------------------------");

        List<Person> nativeQuery2 = personRepository.findByNativeQueryByAttribute("Papa");
        nativeQuery2.forEach(System.out::println);

        System.out.println("------------------------------------------------");

    }

}
