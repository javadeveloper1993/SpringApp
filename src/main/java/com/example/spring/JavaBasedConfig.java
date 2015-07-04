package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring.model.Person;

/**
 * @author Maulik
 *
 */
@Configuration
public class JavaBasedConfig {
	
	@Bean(name="person1")
	public Person person(){
		return new Person();
	}

}
