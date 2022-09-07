package com.PostRequest.service;

import com.PostRequest.Repository.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PostRequest.Utility.Utilitiea;

import reactor.core.publisher.Flux;

@Service
public class PostService {

	@Autowired
	private Repositories repository;
	public Flux<Object> getById(String id){
		return repository.findById(id).map(Utilitiea::entityToDto);
	}


}
