package com.aniketshawcoding.xmlConverterUsingJackson;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

@JacksonXmlRootElement
public class Book {

    @JacksonXmlProperty(localName = "title")
    private String title;

    @JacksonXmlProperty(localName = "author")
    private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

    
}
