package com.learning.pjyotik.properties;

import com.learning.pjyotik.properties.reader.JsonFileReader;
import com.learning.pjyotik.properties.reader.PropertyFileReader;
import com.learning.pjyotik.properties.reader.YmlReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PropertiesTest {

    private static final Logger logger = LogManager.getLogger(PropertiesTest.class);

    @Test
    public void testPropertyFileReader(){
        logger.info("************** READING PROPERTY FILE **************");
        String browser = new PropertyFileReader().getConfig().getBrowser();
        logger.info("BROWSER : "+browser);

        String favtools = new PropertyFileReader().getConfig().getFavtools();
        List<String> stringList = Arrays.asList(favtools.split(","));
        stringList.forEach(System.out::println);
    }

    @Test
    public void testJsonFileReader(){
        logger.info("************** READING JSON PROPERTY FILE **************");
        String username = new JsonFileReader().getConfig().getUsername();
        logger.info("USERNAME : "+username);
    }

    @Test
    public void testYmlReader(){
        logger.info("************** READING YML PROPERTY FILE **************");
        ApplicationProperties applicationProperties = new YmlReader().getConfig();
        logger.info("TIME OUT IN SECONDS : "+applicationProperties.getTimeOutInSeconds());

    }
}
