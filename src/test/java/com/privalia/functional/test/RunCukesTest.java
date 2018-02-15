package com.privalia.functional.test;

import com.privalia.functional.Belly;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class RunCukesTest {

}
