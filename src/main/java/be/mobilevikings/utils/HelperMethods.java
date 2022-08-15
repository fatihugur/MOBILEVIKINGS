package be.mobilevikings.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static be.mobilevikings.base.BasePage.driver;

public class HelperMethods {

    public static void sendText(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.println("Some exception occurred while sending keys at " + element);
        }
    }

    public static void doClick(WebElement element) {
        try {
            waitForClickability(element);
            element.click();
        } catch (Exception e) {
            System.out.println("Some exception occurred while clicking at " + element);
        }
    }

    public static String doGetPageTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            System.out.println("Some exception occurred while getting the title");
            return null;
        }
    }

    public static String getCurrentURL() {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            System.out.println("Some exception occurred while getting the URL");
            return null;
        }
    }

    public static String doGetText(WebElement element) {
        try {
            return element.getText();
        } catch (Exception e) {
            System.out.println("Some exception occured while getting the text " + element);
            return null;
        }
    }

    public static boolean doIsDisplayed(WebElement element) {
        try {
            waitForVisibility(element);
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Some exception occurred while checking if the element is displayed or not " + element);
            return false;
        }
    }

    public static WebDriverWait getWaitObject() {
        return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
    }

    public static void waitForVisibility(WebElement element) {
        getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForClickability(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void windowHandles(){
        System.out.println(driver.getWindowHandles());
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> windowHandleList = new ArrayList<String>(windowHandles);
        String parentWindow = windowHandleList.get(0);
        String newWindow = windowHandleList.get(1);
        driver.switchTo().window(newWindow);
    }

    public static void specificScrollPageDown() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0, 500);");
    }
    public static void specific2ScrollPageDown() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0, 750);");
    }
    public static void dropDownMenu(WebElement element){
        Select select = new Select(element);
        select.selectByIndex(1);
    }
    public static void frame(List<WebElement> element1, WebElement element2){
        List<WebElement> iframes = element1;
        driver.switchTo().frame(element2);
    }

}