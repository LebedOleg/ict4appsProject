package ict4appsProject;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features=
//        "src/test/resources/Workflow(Status).feature"
  //      "src/test/resources/GenerateTestData.feature"
        "src/test/resources/Structures.feature"
)
public class DefinitionTestSuite {}
