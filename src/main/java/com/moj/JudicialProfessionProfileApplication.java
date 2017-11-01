package com.moj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Import({ springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class })
@SpringBootApplication
@ComponentScan({ "com.moj", "com.phearun.fileupload" })
public class JudicialProfessionProfileApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JudicialProfessionProfileApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JudicialProfessionProfileApplication.class);
	}
}
