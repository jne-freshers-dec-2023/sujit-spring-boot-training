package com.myFirst.demoProject.XmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlCongiguration  {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("contextConfig.xml");
      System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
    }

}
