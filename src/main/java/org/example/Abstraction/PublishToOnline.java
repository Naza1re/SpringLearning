package org.example.Abstraction;

import org.springframework.stereotype.Component;

@Component
public class PublishToOnline implements PublishComment{
    @Override
    public void publishComment() {
        System.out.println("publishing online");
    }
}
