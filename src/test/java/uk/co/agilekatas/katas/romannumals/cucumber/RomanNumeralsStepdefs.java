package uk.co.agilekatas.katas.romannumals.cucumber;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.agilekatas.katas.romannumals.RomanNumerals;

public class RomanNumeralsStepdefs {

    private RomanNumerals romanNumerals;
    private String numeral;

    @Given("^I have started the converter$")
    public void I_have_started_the_converter() {
        romanNumerals = new RomanNumerals();
    }

    @When("^I enter ([^\"]*)$")
    public void I_enter_number(int number) {
        numeral = romanNumerals.toNumeral(number);
    }

    @Then("^([^\"]*) is returned$")
    public void numeral_is_returned(String numeral) {
        assertThat(this.numeral).isEqualTo(numeral);
    }
}
