package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/main/features/login.feature",
        glue = {"Steps","Driver.AppDriver"},
        tags = "@TestLogin",
        monochrome = true,
        publish = true,
        plugin = {"pretty", "json:target/report.json", "junit:target/report.xml", "html:target/cucumber-reports.html" },
// snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true)

public class Runner {


}