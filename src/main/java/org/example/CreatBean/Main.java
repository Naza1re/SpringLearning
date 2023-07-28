package org.example.CreatBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);


        Parrot p = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);
        person.setName("nikola");
        p.setName("koko");
        System.out.println(person);

        System.out.println(p);

    }
}
