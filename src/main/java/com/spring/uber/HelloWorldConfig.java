package com.spring.uber;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration // Make this class a configuration class
@EnableWebMvc // Using web mvc
@ComponentScan(basePackages = "com.spring.uber") // Make the bean be scanned
public class HelloWorldConfig {

}
