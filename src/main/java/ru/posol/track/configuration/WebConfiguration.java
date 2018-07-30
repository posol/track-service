package ru.posol.track.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *  CORS config
 */
@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * Enables Cross-Origin Resource Sharing (CORS)
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**");
    }

}
