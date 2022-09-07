package com.PostRequest.Handlers;

import com.PostRequest.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
@Component
public class Handler {

	@Autowired
	private static PostService postservice;
	public static Mono<ServerResponse> getById(ServerRequest request){
		int id = Integer.parseInt(request.pathVariable("id"));
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(postservice.getById(String.valueOf(id))));
	}

	public static void setPostservice(PostService postservice) {
		Handler.postservice = postservice;
	}
}
