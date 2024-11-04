package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class DisplayBalanceSteps {
    private Wallet wallet;
    private int balanceDisplayed;

    @Given("there is ${int} in my wallet")
    public void there_is_$100_in_my_wallet(Integer int1) {
        wallet = new Wallet();
        wallet.deposit(int1);
    }
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        balanceDisplayed = wallet.getBalance();
    }
    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$100(Integer expectedBalance) {
        assertThat(balanceDisplayed).isEqualTo(expectedBalance);
    }
}
