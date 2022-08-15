package be.mobilevikings.stepdefinitions;
import be.mobilevikings.base.BasePage;
import be.mobilevikings.base.ConfigReader;
import be.mobilevikings.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {

    //Testing Mobile Vikings HomePage
    @Given("User is on the home page")
    public void userIsOnTheHomePage() { BasePage.initializeDriver();
    }
    //Testing Mobile Vikings HomePage URL
    @When("get home page url")
    public void getHomepageUrl() throws InterruptedException { System.out.println("Mobile Vikings Home Page URL: "  + HomePage.getHomepageURL());
            Thread.sleep(2000);
    }
    //Testing Mobile Vikings HomePage expected URL
    @And("verify if url is expected")
    public void verifyIfUrlIsExpected() throws InterruptedException{
        String expectedURL = ConfigReader.getProperty("url");
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        Thread.sleep(2000);
    }
    //Testing Mobile Vikings HomePage Page Title
    @And("get home page title")
    public void getHomePageTitle() throws InterruptedException {
        System.out.println("Expected Title: " + HomePage.getHomepageTitle());
        Thread.sleep(2000);
    }
    //Testing Mobile Vikings HomePage expected Title
    @And("verify if title is expected")
    public void verifyIfTitleIsExpected() throws InterruptedException{
        String expectedTitle = "Mobile Vikings | Scherpste prijs voor mobiel & thuis internet";
        Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
        Thread.sleep(2000);
    }
    // When Popup opens > click Accept Cookies Button
    @And("click Accept Cookies Button")
    public void clickAcceptCookiesButton() throws InterruptedException{
        HomePage.clickAcceptCookiesButton();
        Thread.sleep(3000);
    }
    //  User Click Viking Clan Button from HomePage
    @And("Test Viking Clan page button")
    public void testVikingClanPageButton()throws InterruptedException{
        HomePage.clickVikingClanButton();
        Thread.sleep(3000);
    }
    // After clicking Viking Clan Menu Button user sees Viking Clan Page
    @Then("User sees Viking Clan page")
    public void userSeesVikingClanPage() {
        String expectedURL = "https://mobilevikings.be/nl/viking-clan/";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL for Viking Clan Page: " + HomePage.verifyURL());
    }
    //  User Click Viking Deals Menu Button from Viking Clan Page
    @And("Test Vikings Deals page button")
    public void testVikingsDealsPageButton() throws InterruptedException{
        HomePage.clickVikingDealsButton();
        Thread.sleep(3000);
    }
    // After clicking Viking Deals Button user sees Viking Deals Page
    @Then("User sees Vikings Deals page")
    public void userSeesVikingsDealsPage() {
        String expectedURL = "https://mobilevikings.be/nl/viking-deals/";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL for Viking Deals Page: " + HomePage.verifyURL());
    }
}
