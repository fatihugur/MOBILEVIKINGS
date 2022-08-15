package be.mobilevikings.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/site/cucumber-pretty.html",
                "json:target/cucumber-html-reports/cucumber.json",
                "junit:target/cucumber-xml-reports/cucumber.xml"},
        features = {"src/test/resources/features"},
        glue = {"be/mobilevikings/stepdefinitions"}

)

public class TestRunner {
}
