package com.microservices2.exercise1.zuul;

import com.microservices2.exercise1.zuul.filters.ErrorFilter;
import com.microservices2.exercise1.zuul.filters.PostFilter;
import com.microservices2.exercise1.zuul.filters.PreFilter;
import com.microservices2.exercise1.zuul.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter(){
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter(){
		return new PostFilter();
	}

	@Bean
	public RouteFilter routeFilter(){
		return new RouteFilter();
	}

	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}

}
