package com.aniketshawcoding.xmlConverterUsingJackson;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;

@Service
public class XMLService {

    public <T> T convertFromXML(String xml, Class<T> type) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(xml, type);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String convertToXML(Object object) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
