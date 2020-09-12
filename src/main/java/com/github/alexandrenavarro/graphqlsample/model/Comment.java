package com.github.alexandrenavarro.graphqlsample.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
class Comment {

    private Long id;
    private String description;

}
