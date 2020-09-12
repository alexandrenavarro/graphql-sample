package com.github.alexandrenavarro.graphqlsample.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {

    private Long id;
    private String text;
    private Comment comment;

    public Post(Long id) {
        this.id = id;
        this.text = "text";
        this.comment = Comment.builder()
                .id(2l)
                .description("description")
                .build();
    }

}