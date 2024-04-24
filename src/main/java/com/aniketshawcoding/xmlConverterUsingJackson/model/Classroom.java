package com.aniketshawcoding.xmlConverterUsingJackson.model;

import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

public class Classroom {
    @JacksonXmlProperty(localName = "classroom_number")
    private String classroomNumber;

    @JacksonXmlElementWrapper(localName = "benches")
    @JacksonXmlProperty(localName = "bench")
    private List<Bench> benches;

    @JacksonXmlElementWrapper(localName = "chairs")
    @JacksonXmlProperty(localName = "chair")
    private List<Chair> chairs;

	public String getClassroomNumber() {
		return classroomNumber;
	}

	public void setClassroomNumber(String classroomNumber) {
		this.classroomNumber = classroomNumber;
	}

	public List<Bench> getBenches() {
		return benches;
	}

	public void setBenches(List<Bench> benches) {
		this.benches = benches;
	}

	public List<Chair> getChairs() {
		return chairs;
	}

	public void setChairs(List<Chair> chairs) {
		this.chairs = chairs;
	}
}
