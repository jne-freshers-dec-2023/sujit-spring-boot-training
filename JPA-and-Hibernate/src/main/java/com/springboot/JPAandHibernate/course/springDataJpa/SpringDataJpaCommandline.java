package com.springboot.JPAandHibernate.course.springDataJpa;

import com.springboot.JPAandHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringDataJpaCommandline implements CommandLineRunner {

    @Autowired
    private  SpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(9,"learn aws data", "in 28 mins")) ;
        repository.save(new Course(10,"learn java data", "in 28 mins")) ;
        repository.save(new Course(11,"learn angular data", "in 28 mins")) ;
        repository.save(new Course(12,"learn js data", "in 28 mins")) ;
        repository.deleteById(10l);

        System.out.println( repository.findAll());
        System.out.println( repository.count());
        System.out.println( repository.findByAuthor("in 28 mins"));

    }
}
