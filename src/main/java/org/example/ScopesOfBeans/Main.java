package org.example.ScopesOfBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);
        person.setName("Nazar");
        parrot.setName("kakadu");
        System.out.println(parrot = parrot);

        System.out.println(person);
        System.out.println(person);

    }
}
