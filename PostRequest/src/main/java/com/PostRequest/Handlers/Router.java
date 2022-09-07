package com.PostRequest.Handlers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

	@Bean
	public RouterFunction<ServerResponse> FunctionalRoute(Handler handler){
		  return RouterFunctions.route()
				  .POST("/api/v1/transfer-request/order", RequestPredicates.contentType(MediaType.APPLICATION_JSON), Handler::getById )
				  .build();
	}
	
}
