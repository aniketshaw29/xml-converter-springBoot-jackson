package com.aniketshawcoding.xmlConverterUsingJackson.model;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

public class Chair {
    @JacksonXmlProperty(localName = "chair_number")
    private String chairNumber;

	public String getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(String chairNumber) {
		this.chairNumber = chairNumber;
	}
}
