package com.joaorodriguesdev.workshopmongoo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaorodriguesdev.workshopmongoo.domain.Post;
import com.joaorodriguesdev.workshopmongoo.domain.User;
import com.joaorodriguesdev.workshopmongoo.repository.PostRepository;
import com.joaorodriguesdev.workshopmongoo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
}
