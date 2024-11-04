package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
//        Wallet wallet = new Wallet();
        wallet.deposit(200);
//        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        assertThat(wallet.getBalance()).isEqualTo(200);
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertThat(cashSlot.getContents()).isEqualTo(30);
    }
    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        assertThat(wallet.getBalance()).isEqualTo(170);
    }
}
