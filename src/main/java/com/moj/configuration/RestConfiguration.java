package com.moj.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.moj.model.Officer;
import com.moj.model.Position;

@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Officer.class);
		config.exposeIdsFor(Position.class);
	}

}
