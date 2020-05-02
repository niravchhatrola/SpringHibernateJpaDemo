package com.chhatrola.SpringHibernateJpaDemo.repository;

import com.chhatrola.SpringHibernateJpaDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by niv214 on 1/5/20.
 */
@Repository
public interface StudentSpringDataJpaRepository extends JpaRepository<Student, Long> {

    public List<Student> findByNameAndId(String name, Long id);

    @Query("Select s from Student s where s.id >= 1002")
    public List<Student> getAllStudentWithids();


    @Query("Select s from Student s where s.id=:id")
    public List<Student> getAllStudentWithidParameterized(@Param("id") Long id);

    @Query("Select s from Student s join s.courses c where c.name=:name")
    public List<Student> getAllStudentRegestiredWithCourse(@Param("name") String name);


    @Query("Select s from Student s join s.courses c join c.reviews r where r.rating=:rating")
    public List<Student> getAllStudentHasRegisterdCourseWithReviewRating(@Param("rating") String rating);


}


