package com.epsi.configuration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Fichier de configuration Spring MVC.
 * 
 * @author jerome.coubronne
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.epsi.controller" })
@EnableWebMvc
public class WebMvcConfiguration implements WebMvcConfigurer {

	/**
	 * Gestionnaire de l'emplacement des fichiers ressources.
	 * 
	 */
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	/**
	 * Gestion de l'encoding en UTF-8 de l'application
	 * 
	 * @return
	 */
	@Bean(name = "messageSource")
	public ReloadableResourceBundleMessageSource getMessageSource() {
		ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
		resource.setBasename("classpath:messages");
		resource.setDefaultEncoding("UTF-8");
		return resource;
	}
}
