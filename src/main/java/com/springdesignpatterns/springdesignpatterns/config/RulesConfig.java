package com.springdesignpatterns.springdesignpatterns.config;


import com.springdesignpatterns.springdesignpatterns.rule.Rule1;
import com.springdesignpatterns.springdesignpatterns.rule.Rule2;
import com.springdesignpatterns.springdesignpatterns.rule.VisitorRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class RulesConfig {


	@Bean
	@Order(1)
	public VisitorRule rule1(){
		return new Rule1();
	}

	@Bean
	@Order(2)
	public VisitorRule rule2() {
		return new Rule2();
	}

}
