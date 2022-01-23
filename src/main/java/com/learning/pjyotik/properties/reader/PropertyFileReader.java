package com.learning.pjyotik.properties.reader;

import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import com.learning.pjyotik.properties.ApplicationProperties;
import lombok.SneakyThrows;

import java.io.File;

public class PropertyFileReader implements IApplicationConfigReader{

    @SneakyThrows
    @Override
    public ApplicationProperties getConfig() {
        return new JavaPropsMapper().readValue(new File("./src/test/resources/config/ApplicationConfig.properties"),
                ApplicationProperties.class);
    }
}
