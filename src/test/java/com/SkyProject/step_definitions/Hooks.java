package com.SkyProject.step_definitions;

import com.SkyProject.utilities.ConfigurationReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {

    @Before
    public void setUp() {
        //RestAssured.baseURI = ConfigurationReader.get("BaseURI");



    }

    @After
    public void endAPISession(){


    }
}
