package com.epsi.configuration.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Fichier de configuration Spring pour la partie Front du projet.
 * 
 * @author jerome.coubronne
 *
 */
@Configuration
@Import({ WebMvcConfiguration.class, WebSecurityConfiguration.class })
public class SpringFrontConfiguration {

}
