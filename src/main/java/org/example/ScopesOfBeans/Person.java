package org.example.ScopesOfBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", parrot=" + birds +
                '}';
    }

    @Autowired
    private Birds birds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
