package com.github.alexandrenavarro.graphqlsample.api;

import com.github.alexandrenavarro.graphqlsample.model.Post;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class Query implements GraphQLQueryResolver {

    private List<Post> posts = List.of(new Post(1L), new Post(2L));

    public Post getPost(Long id) {
        return new Post(id);
    }

    public List<Post> getPosts() {
        return List.of(new Post(1L), new Post(2L));
    }

    public List<Post> getPostsById(Long id) {
        return posts.stream()
                .filter(e -> e.getId() == id)
                .collect(Collectors.toList());
    }


}