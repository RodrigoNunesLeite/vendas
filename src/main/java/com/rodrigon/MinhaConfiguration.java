package com.rodrigon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * A notation configuration, habilita essa classe
 * pro contexto da aplicação
 * */
@Configuration
public class MinhaConfiguration {
	
	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de Vendas";
	}
}
