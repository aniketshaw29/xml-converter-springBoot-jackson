package com.aniketshawcoding.xmlConverterUsingJackson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aniketshawcoding.xmlConverterUsingJackson.model.Book;
import com.aniketshawcoding.xmlConverterUsingJackson.service.XMLService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private XMLService bookService;

    @PostMapping("/book/toObject")
    public Book convertToObject(@RequestBody String xml) {
        return bookService.convertFromXML(xml, Book.class);
    }

    @PostMapping("/book/toXML")
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
