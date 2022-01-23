package com.learning.pjyotik.properties;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class AppConfigOwnerTest {

    @Test
    public void testOwnerClassImpl() {

        IAppConfigOwner iAppConfigOwner = ConfigFactory.create(IAppConfigOwner.class);
        iAppConfigOwner.favtools().forEach(System.out::println);
        System.out.println(iAppConfigOwner.browser());
    }
}
