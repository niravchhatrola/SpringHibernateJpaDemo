package com.chhatrola.SpringHibernateJpaDemo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by niv214 on 26/4/20.
 */
@Entity
public class Student {

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private Passport passport;


    @ManyToMany(mappedBy = "students")
    private List<Course> courses = new ArrayList<>();

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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' +
                '\n';
    }
}
