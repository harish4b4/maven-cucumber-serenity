package MavenCucumberTester;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by E002465 on 15-02-2017.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber/", "json:target/cucumber/cucumber.json", "usage:target/cucumber/cucumber-usage.json"}, features="src/test/java/FeatureFiles/feat.feature", tags={"@e2e"},monochrome = true)
public class Runn{
}
