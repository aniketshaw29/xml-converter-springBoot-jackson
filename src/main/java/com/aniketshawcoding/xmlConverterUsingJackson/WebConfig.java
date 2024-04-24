package com.aniketshawcoding.xmlConverterUsingJackson;

import java.util.List;

import org.springframework.context.annotation.*;
import org.springframework.http.converter.*;
import org.springframework.http.converter.json.*;
import org.springframework.http.converter.xml.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        ObjectMapper objectMapper = new XmlMapper().enable(SerializationFeature.INDENT_OUTPUT);
        converters.add(new MappingJackson2XmlHttpMessageConverter(objectMapper));
        converters.add(new MappingJackson2HttpMessageConverter(objectMapper));
    }
}
