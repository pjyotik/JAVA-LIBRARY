package com.learning.pjyotik.properties.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.pjyotik.properties.ApplicationProperties;
import lombok.SneakyThrows;

import java.io.File;

public class JsonFileReader implements IApplicationConfigReader {

    @SneakyThrows
    @Override
    public ApplicationProperties getConfig() {
        return new ObjectMapper().readValue(new File("./src/test/resources/config/ApplicationConfig.json"),
                ApplicationProperties.class);
    }
}
