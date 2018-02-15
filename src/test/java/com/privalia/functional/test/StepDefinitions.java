package com.privalia.functional.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import com.privalia.functional.Belly;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.ClassRule;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@ContextConfiguration(classes = {Belly.class})
public class StepDefinitions {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private Belly belly;
    private int waitingTime;

    @Given("I have (\\d+) cukes in my belly")
    public void i_have_cukes_in_my_belly(int cukes) {
        belly.eat(cukes);
    }

    @When("I wait (\\d+) hour")
    public void i_wait_hour(int waitingTime){
        this.waitingTime = waitingTime;
    }

    @Then("my belly should (.*)")
    public void my_belly_should_growl(String expectedSound){
        String actualSound = belly.getSound(this.waitingTime);
        assertThat(actualSound, is(expectedSound));
    }
}
