package be.mobilevikings.pages;
import be.mobilevikings.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static be.mobilevikings.base.BasePage.driver;
public class HomePage {

    // Fields: Locators, Webelements,
    // xpath mobilevikings.be logo
    // //*[@id="header"]/div/div[1]/a

    //Mobile Vikingis Home Page Accept Cookies Button
    @FindBy(id="btn-accept-cookies")
    public static WebElement acceptCookiesButton;

    // Mobile Vikings Web Page Logo
    @FindBy(xpath="/html/body/header/div[3]/div/div[1]/a")
    public static WebElement mobileVikingsLogo;

    // xpath mobilevikings.be Viking Clan menu button
    // /html/body/header/div[3]/div/div[1]/nav/ul/li[5]/a
    @FindBy(xpath="/html/body/header/div[3]/div/div[1]/nav/ul/li[5]/a")
    public static WebElement vikingClanButton;

    // xpath mobilevikings.be Viking Deals menu button
    // /html/body/header/div[3]/div/div[1]/nav/ul/li[4]/a
    @FindBy(xpath="/html/body/header/div[3]/div/div[1]/nav/ul/li[4]/a")
    public static WebElement vikingDealsButton;
    // PageFactory
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public static String getHomepageTitle(){
        return HelperMethods.doGetPageTitle();
    }
    public static String getHomepageURL(){
        return HelperMethods.getCurrentURL();
    }
    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }
    public static void clickAcceptCookiesButton(){
        HelperMethods.doClick(acceptCookiesButton);
    };

    // CLICK VIKING CLAN MENU BUTTON
    public static void clickVikingClanButton() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(vikingClanButton.getText());
        HelperMethods.doClick(vikingClanButton);
    }

    // CLICK VIKING DEALS MENU BUTTON
    public static void clickVikingDealsButton() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(vikingDealsButton.getText());
        HelperMethods.doClick(vikingDealsButton);
    }

}
