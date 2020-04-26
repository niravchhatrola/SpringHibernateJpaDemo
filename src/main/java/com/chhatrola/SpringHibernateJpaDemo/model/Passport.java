package com.chhatrola.SpringHibernateJpaDemo.model;

import javax.persistence.*;

/**
 * Created by niv214 on 26/4/20.
 */
@Entity
public class Passport {

    public Passport() {
    }

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String passportNumber;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
