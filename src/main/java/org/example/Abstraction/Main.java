package org.example.Abstraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment("My new Post");
    }
    }

