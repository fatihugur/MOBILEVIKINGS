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

    //@FindBy(id="header")
    @FindBy(xpath="/html/body/header/div[3]/div/div[1]/a")
    public static WebElement mobileVikingsLogo;

    // xpath mobilevikings.be Viking Clan menu button
    //
    @FindBy(xpath="")
    public static WebElement vikingClanButton;

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


}
