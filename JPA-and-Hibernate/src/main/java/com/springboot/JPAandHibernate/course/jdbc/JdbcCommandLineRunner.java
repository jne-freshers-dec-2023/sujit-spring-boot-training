package com.springboot.JPAandHibernate.course.jdbc;

import com.springboot.JPAandHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"learn aws", "in 28 mins")) ;
        repository.insert(new Course(2,"learn java", "in 28 mins")) ;
        repository.insert(new Course(3,"learn angular", "in 28 mins")) ;
        repository.insert(new Course(4,"learn js", "in 28 mins")) ;
        repository.deleteRecord(1);

        System.out.println( repository.getById(3));

    }
}
