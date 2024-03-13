package com.springboot.JPAandHibernate.course.jpa;

import com.springboot.JPAandHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaCommandlineRunner implements CommandLineRunner {

    @Autowired
    private JpaRepositoryClass repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(5,"learn aws jpa", "in 28 mins")) ;
        repository.insert(new Course(6,"learn java jpa", "in 28 mins")) ;
        repository.insert(new Course(7,"learn angular jpa", "in 28 mins")) ;
        repository.insert(new Course(8,"learn js jpa", "in 28 mins")) ;
        repository.deleteById(5);

        System.out.println( repository.findById(8));
    }
}
