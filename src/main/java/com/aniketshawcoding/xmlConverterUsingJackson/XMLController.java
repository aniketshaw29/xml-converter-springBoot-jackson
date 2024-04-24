package com.aniketshawcoding.xmlConverterUsingJackson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
@RequestMapping("/api")
public class XMLController {

    @Autowired
    private XMLService xmlService;

    @PostMapping("/xml/toObject")
    public Book convertToObject(@RequestBody String xml) {
        return xmlService.convertFromXML(xml, Book.class);
    }

    @PostMapping("/xml/toXML")
    public String convertToXML(@RequestBody Book book) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.writeValueAsString(book);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error converting to XML";
        }
    }
}
