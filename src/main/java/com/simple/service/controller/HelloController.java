package com.simple.service.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

	@Get
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		System.out.println("hello controller");
		return "Hello Madhusudhan";
	}
}