package com.synthshowcase.SynthesizersShowcase;

import com.synthshowcase.SynthesizersShowcase.model.Synthesizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class SynthesizersShowcaseApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SynthesizersShowcaseApplication.class, args);
	}

	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Synthesizer.class);
    }

}
