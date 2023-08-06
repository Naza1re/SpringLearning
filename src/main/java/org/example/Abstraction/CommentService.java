package org.example.Abstraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @Qualifier("publishToOnline")
    @Autowired
    public PublishComment publishComment;
    public  void publishComment(String comment){
        System.out.println(comment);
        publishComment.publishComment();

    }

}
