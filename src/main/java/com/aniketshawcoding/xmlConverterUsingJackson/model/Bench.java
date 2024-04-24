package com.aniketshawcoding.xmlConverterUsingJackson.model;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

public class Bench {
    @JacksonXmlProperty(localName = "bench_number")
    private String benchNumber;

	public String getBenchNumber() {
		return benchNumber;
	}

	public void setBenchNumber(String benchNumber) {
		this.benchNumber = benchNumber;
	}
}
