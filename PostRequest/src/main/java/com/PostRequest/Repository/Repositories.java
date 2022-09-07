package com.PostRequest.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.ui.Model;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface Repositories extends ReactiveMongoRepository<Model, UUID> {
	Flux<Object> findById(String id);
}
