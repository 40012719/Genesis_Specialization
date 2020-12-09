package RunFiles;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"ClassFiles"},
        plugin = { "html:target/Report-html"},
        monochrome = true
        )

public class Runner {
    

}