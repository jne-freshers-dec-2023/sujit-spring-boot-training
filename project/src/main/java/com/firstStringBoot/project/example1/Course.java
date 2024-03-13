package com.firstStringBoot.project.example1;

public class Course {

    private long id;
    private String name;

    private String auther;
    public Course(int id, String name, String auther) {
        this.id= id;
        this.name = name;
        this.auther= auther;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuther() {
        return auther;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }

}
