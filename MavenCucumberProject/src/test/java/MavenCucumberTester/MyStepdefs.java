package MavenCucumberTester;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by E002465 on 15-02-2017.
 */
public class MyStepdefs extends PageObject{

    @FindBy(id = "Email")
    WebElementFacade userNmae;

    @FindBy(id = "next")
    WebElementFacade nextBtn;

    @FindBy(id = "Passwd")
    WebElementFacade pwd;

    @FindBy(id = "signIn")
    WebElementFacade signIn;

    @Step
    @Given("^I am Gmail LoginPage$")
    public void i_am_Gmail_LoginPage() {
        getDriver().get("https://gmail.com");
    }

    @Step
    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String arg1, String arg2) {
        waitFor(userNmae);
        userNmae.sendKeys("any@gmail.com");
        nextBtn.click();
        waitFor(pwd);
        pwd.sendKeys("pwd");
       signIn.click();
    }

    @Step
    @Then("^I should be on Gmail home page$")
    public void i_should_be_on_Gmail_home_page() {
        assert getDriver().getCurrentUrl().contains("inbox");
    }
}
