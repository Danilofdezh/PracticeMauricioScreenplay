package com.co.screenplay.stepdefinitions;

import com.co.screenplay.tasks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefinitions {

    @When("^he user his log$")
    public void heUserHisLog() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter());
    }

    @Then("^he could see id$")
    public void heCouldSeeId() {

    }
}
