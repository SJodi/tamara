package Test;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "summary"
        },
        features = {"src/test/resources/features/Admin/MasterEvent/CreateMasteEvent.feature"},
        snippets = CAMELCASE
//        tags = "@login"
)
public class JunitRunnerTest {

}
