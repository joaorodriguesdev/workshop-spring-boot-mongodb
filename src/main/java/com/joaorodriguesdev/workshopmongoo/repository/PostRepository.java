package com.joaorodriguesdev.workshopmongoo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaorodriguesdev.workshopmongoo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
