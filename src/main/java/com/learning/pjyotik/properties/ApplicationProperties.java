package com.learning.pjyotik.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationProperties {

    private String username;
    private String password;
    private String browser;
    private String takeScreenShots;
    private String timeOutInSeconds;
    private String favtools;
}
