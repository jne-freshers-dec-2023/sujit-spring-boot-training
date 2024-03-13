package com.springboot.JPAandHibernate.course.springDataJpa;

import com.springboot.JPAandHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaRepository extends JpaRepository <Course, Long>{
   List<Course> findByAuthor(String author);
}
