package com.mashensoft.eurekaclient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringEurekaClientApplication {
	@RequestMapping(value = "/", produces = "application/json;charset=UTF-8")
	public Map<String,Object> hello() {
		Map<String,Object> map = new HashMap<>();
		map.put("username", "zongxing");
		return map;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientApplication.class, args);
	}

}
