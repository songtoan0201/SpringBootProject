package com.infostretch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class AppConfig {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppConfig.class, args);
		
		AppConfig app = new AppConfig();
		IFlowTest test = app.createFlowTest();
		System.out.println(test.getResult("five"));
	}
	
	@Bean(name = "IObjectVal")
	public IObjectVal createConvertString() {
		return new ObjectVal();
	}
	
	@Bean(name = "IRangeVal")
	public IRangeVal createRangeVal() {
		return new RangeVal();
	}
	
	@Bean(name = "IGetFizzBuzz")
	public IGetFizzBuzz createFizzBuzz() {
		return new GetFizzBuzz();
	}
	
	@Bean(name = "IFlowTest")
	public IFlowTest createFlowTest() {
		return new Flow(createConvertString(), createRangeVal(), createFizzBuzz());
	}
}
