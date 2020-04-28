package com.chhatrola.SpringHibernateJpaDemo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by niv214 on 27/4/20.
 */
@Entity
public class Course {

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "course")
    private List<Review> reviews = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = {@JoinColumn(name = "course")},
            inverseJoinColumns = @JoinColumn(name = "student")
    )
    private List<Student> students = new ArrayList<>();

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

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public void deleteReview(Review review){
        reviews.remove(review);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
