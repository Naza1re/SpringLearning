package org.example.Abstraction;

import org.springframework.stereotype.Component;

@Component
public class PublishToNewspapper implements PublishComment{
    @Override
    public void publishComment() {
        System.out.println("publishing to newspapper");
    }
}
