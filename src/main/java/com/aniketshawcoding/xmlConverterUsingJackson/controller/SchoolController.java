package com.aniketshawcoding.xmlConverterUsingJackson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aniketshawcoding.xmlConverterUsingJackson.model.*;
import com.aniketshawcoding.xmlConverterUsingJackson.service.XMLService;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private XMLService schoolService;

    @PostMapping("/school/toObject")
    public School convertToObject(@RequestBody String xml) {
        return schoolService.convertFromXML(xml, School.class);
    }

    @PostMapping("/school/toXML")
    public String convertToXML(@RequestBody School school) {
        return schoolService.convertToXML(school);
    }
}
