package com.learning.pjyotik.properties.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.learning.pjyotik.properties.ApplicationProperties;
import lombok.SneakyThrows;

import java.io.File;

public class YmlReader implements IApplicationConfigReader{

    @SneakyThrows
    @Override
    public ApplicationProperties getConfig() {
        return new ObjectMapper(new YAMLFactory()).readValue(new File("./src/test/resources/config/ApplicationConfig.yml"),
                ApplicationProperties.class);
    }
}
