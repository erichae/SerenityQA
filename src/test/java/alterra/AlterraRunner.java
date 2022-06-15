package alterra;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:cucumber-report.html", "json:cucumber-json.json"},
        features = "classpath:features/alterratask"
)
public class AlterraRunner {}
