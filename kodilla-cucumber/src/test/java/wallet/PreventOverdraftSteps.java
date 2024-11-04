package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PreventOverdraftSteps {
    private Wallet wallet;

    @Given("there is ${int} in my savings account")
    public void there_is_$100_in_my_savings_account(Integer amount) {
        wallet = new Wallet();
        wallet.deposit(amount);  // Poprawna inicjalizacja portfela
    }
    @When("I withdraw ${int}")
    public void i_withdraw_$200(Integer amount) {
        wallet.debit(amount);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertThat(wallet.getBalance()).isEqualTo(100);

    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        assertThat(wallet.getMessage()).isEqualTo("Not enough money in the wallet");
    }

}
