package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".../src/test/resources/features/stockbit_register.feature",
        glue= {"StepDefinition"},
        plugin ={"pretty","json:target/cucumber.json"})
public class TestRunner {
}