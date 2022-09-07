package com.PostRequest.WebClient;

import com.PostRequest.Model.Models;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientCheck {
    private WebClient client = WebClient.create("http://localhost:8080");
    public void postOrder(){
       client.post()
               .uri("/api/v1/transfer-request/order")
               .bodyValue(new Models("postRequest"))
               .exchange()
               .flatMap(res -> res.bodyToMono(Models.class))
               .subscribe(Models->System.out.println("POST: "+ Models.getId()));
    }
}
