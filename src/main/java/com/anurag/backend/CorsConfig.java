
package com.anurag.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                    "https://frntd-ef2pp7ojy-kiran-2d6b.vercel.app"
                )
                .allowedMethods(
                    "GET", "POST", "PUT", "DELETE", "OPTIONS"
                )
                .allowedHeaders("*");
    }
}
