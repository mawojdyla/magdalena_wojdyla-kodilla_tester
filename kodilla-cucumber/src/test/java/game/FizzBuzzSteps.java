package game;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzSteps {
    private int number;
    private String result;

    @Given("the number {int}")
    public void the_number(int number) {
        this.number = number;
    }
    @When("I check if the number is divisible by 3 or 5 or both")
    public void i_check_if_the_number_is_divisible_by_3_or_5_or_both() {
        result = FizzBuzz.checkNumber(number);
    }

    @Then("In response I should get {string}")
    public void in_response_i_should_get_fizz(String expectedOutput) {
        assertThat(result).isEqualTo(expectedOutput);
    }

}
