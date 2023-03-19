package com.mycompany.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Viktor Sidochenko viktor.sidochenko@gmail.com
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},
        plugin = {
//                "timeline:test-output-thread/",
                "pretty", "html:target/cucumber-html-report"
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class CucumberJvmTest {

}
