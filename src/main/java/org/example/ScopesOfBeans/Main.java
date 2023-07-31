package org.example.ScopesOfBeans;

import org.example.CreatBean.Parrot;
import org.example.CreatBean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        org.example.ScopesOfBeans.Parrot p = context.getBean(org.example.ScopesOfBeans.Parrot.class);
        org.example.ScopesOfBeans.Parrot p1 = context.getBean(org.example.ScopesOfBeans.Parrot.class);
        org.example.ScopesOfBeans.Person person = context.getBean(org.example.ScopesOfBeans.Person.class);
        org.example.ScopesOfBeans.Person person1 = context.getBean(org.example.ScopesOfBeans.Person.class);

        person.setName("nikola");
        p.setName("koko");
        person1.setName("nikola");
        p1.setName("koko");
        System.out.println(person);
        System.out.println("does equals two parrot : "+ (p==p1));
        System.out.println("does equals two persons : "+ (person==person1));



    }
}
