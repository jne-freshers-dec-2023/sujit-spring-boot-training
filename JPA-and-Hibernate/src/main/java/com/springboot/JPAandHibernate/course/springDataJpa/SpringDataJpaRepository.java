package com.springboot.JPAandHibernate.course.springDataJpa;

import com.springboot.JPAandHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataJpaRepository extends JpaRepository <Course, Long>{
   List<Course> findByAuthor(String author);
}
