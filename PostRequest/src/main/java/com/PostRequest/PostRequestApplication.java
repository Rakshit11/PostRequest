package com.PostRequest;

import com.PostRequest.WebClient.WebClientCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostRequestApplication.class, args);
		WebClientCheck wc=new WebClientCheck();
		wc.postOrder();
	}

}
