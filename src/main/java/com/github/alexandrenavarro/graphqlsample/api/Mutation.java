package com.github.alexandrenavarro.graphqlsample.api;

import com.github.alexandrenavarro.graphqlsample.model.Post;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Mutation implements GraphQLMutationResolver {

    public Post createPost(String text){
        final Post post = new Post(new Random().nextLong());
        post.setText(text);
        return post;
    }
}
