package com.aniketshawcoding.xmlConverterUsingJackson.model;

import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

@JacksonXmlRootElement(localName = "school")
public class School {
    @JacksonXmlElementWrapper(localName = "classrooms")
    @JacksonXmlProperty(localName = "classroom")
    private List<Classroom> classrooms;

	public List<Classroom> getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(List<Classroom> classrooms) {
		this.classrooms = classrooms;
	}
}
