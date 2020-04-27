package com.chhatrola.SpringHibernateJpaDemo.model;

import javax.persistence.*;

/**
 * Created by niv214 on 27/4/20.
 */
@Entity
public class Review {

    public Review() {
    }

    public Review(String rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String rating;
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", rating='" + rating + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
