package com.epsi.configuration.configuration;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javassist.bytecode.stackmap.TypeData.ClassName;

/**
 * Fichier de configuration Spring Security.
 * 
 * @author jerome.coubronne
 *
 */
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	/**
	 * Verifie que l'utilisateur est bien authentifier avant qu'il accéde à une page
	 * web.
	 */
	protected void configure(HttpSecurity http) {

		try {
			http.csrf().disable().authorizeRequests().antMatchers("/resources/**").permitAll().anyRequest()
					.authenticated().and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
					.defaultSuccessUrl("/papote").and().logout().logoutUrl("/logout");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.toString(), e);
		}
		try {
			http.headers().frameOptions().disable();
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.toString(), e);
		}
	}

}
