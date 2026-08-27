package cl.actividad;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FEATURES_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "cl.actividad.steps"
)
@ConfigurationParameter(
        key = FEATURES_PROPERTY_NAME,
        value = "classpath:features/login.feature"
)
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty,html:target/cucumber-report.html"
)
public class RunCucumberTest {
}
