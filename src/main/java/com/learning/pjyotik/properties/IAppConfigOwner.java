package com.learning.pjyotik.properties;

import org.aeonbits.owner.Config;

import java.util.List;

@Config.Sources(value = "file:./src/test/resources/config/ApplicationConfig.properties")
public interface IAppConfigOwner extends Config {

    String username();
    String password();

    @DefaultValue("chrome")
    String browser();

    boolean takeScreenShots();
    Long timeOutInSeconds();
    List<String> favtools();
}
