package com.myFirst.demoProject.typesOfInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BuinessIn{


    //<======= field dependency injection======>
//    @Autowired
//   Type1 type1;
//    @Autowired
//   Type2 type2;
//    public String toString(){
//        return type1+"<====== and ======>"+type2;
//    }

    //<======= setter dependency injection======>

//   Type1 type1;
//   Type2 type2;
//
//    @Autowired
//    public void setType1(Type1 type1) {
//        this.type1 = type1;
//    }
//
//    @Autowired
//    public void setType2(Type2 type2) {
//        this.type2 = type2;
//    }

    //<======= constructor dependency injection======>

   Type1 type1;
   Type2 type2;

   public BuinessIn(Type2 type2 , Type1 type1){
       this.type2 = type2;
       this.type1= type1;
   }



}

@Component
class Type1{

}

@Component
class Type2{

}


@Configuration
@ComponentScan
public class TypesInjection {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(TypesInjection.class);
        System.out.println(context.getBean(BuinessIn.class));

    }
}
