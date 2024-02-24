package com.javainuse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;


@SpringBootApplication
public class OpenShiftMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShiftMicroserviceApplication.class, args);
	}
}
@RestController
class OpenShiftMicroserviceController {
	
	@Autowired
	RestTemplate restTemplate;
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/open-shift-service")
	public String method2() {
		LOG.info("Open Shift Microservice");
//		String baseUrl = "http://localhost:8082/microservice3";
//		String response=(String) restTemplate.exchange(baseUrl,
//				HttpMethod.GET, null,String.class).getBody();
//		LOG.info("The response recieved by method2 is "+ response);
		return "Welcome From Open Shift Microservice";
	}
}