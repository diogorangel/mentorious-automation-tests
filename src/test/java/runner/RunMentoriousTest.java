package runner;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/cucumber",
        "html:target/cucumber-report",
        "json:target/cucumber.json"},
        glue = {"steps"},
        snippets = CAMELCASE,
        features = "src/test/resources/features",
        tags = "@001_Mentorious_LoginStudent"
                                                    )

public class RunMentoriousTest {
}
