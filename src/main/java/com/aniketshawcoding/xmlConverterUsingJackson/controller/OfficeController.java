package com.aniketshawcoding.xmlConverterUsingJackson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aniketshawcoding.xmlConverterUsingJackson.model.*;
import com.aniketshawcoding.xmlConverterUsingJackson.service.XMLService;

@RestController
@RequestMapping("/api")
public class OfficeController {

    @Autowired
    private XMLService officeService;

    @PostMapping("/office/toObject")
    public Office convertToObject(@RequestBody String xml) {
        return officeService.convertFromXML(xml, Office.class);
    }

    @PostMapping("/office/toXML")
    public String convertToXML(@RequestBody Office office) {
        return officeService.convertToXML(office);
    }
}

