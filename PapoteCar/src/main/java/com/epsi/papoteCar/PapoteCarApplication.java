package com.epsi.papoteCar;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.epsi.configuration.configuration.SpringFrontConfiguration;
import com.epsi.configuration.configuration.WebMvcConfiguration;

@SpringBootApplication
@Import({ SpringFrontConfiguration.class })
@EntityScan(basePackages = { "com.epsi.model" })
public class PapoteCarApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	/**
	 * Initialise le servlet dispatcher au lancement de l'application.
	 * 
	 */
	@Override
	public void onStartup(ServletContext container) {

		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

		rootContext.register(SpringFrontConfiguration.class);
		container.addListener(new ContextLoaderListener(rootContext));

		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.register(WebMvcConfiguration.class);

		ServletRegistration.Dynamic registration = container.addServlet("dispatcher",
				new DispatcherServlet(dispatcherContext));
		registration.setLoadOnStartup(1);
		registration.addMapping("/papote");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(PapoteCarApplication.class, args);
	}
}