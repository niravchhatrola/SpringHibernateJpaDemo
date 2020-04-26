package com.chhatrola.SpringHibernateJpaDemo.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by niv214 on 23/4/20.
 */

@Entity
@NamedQueries(value = {
        @NamedQuery(name = "find_all_person", query = "select p from Person p"),
        @NamedQuery(name = "find_all_punekar", query = "select p from Person p where p.location= ?1"),
        @NamedQuery(name = "find_per_loc", query = "select p from Person p where location= :loc")
})
public class Person {

    public Person() {
    }

    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
