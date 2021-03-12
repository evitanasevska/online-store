package com.example.seminarska;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/media/**")
            .addResourceLocations("file:/Users/evitanasevska/Desktop/fax/eimt/vs code/seminarska/src/main/resources/static/media/");
    }
    
}
