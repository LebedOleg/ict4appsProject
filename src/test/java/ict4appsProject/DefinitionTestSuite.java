package ict4appsProject;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features=
//        "src/test/resources/features/consult_dictionary/LookupADefinition.feature"
        "src/test/resources/features/consult_dictionary/Products.feature"
)
public class DefinitionTestSuite {}
