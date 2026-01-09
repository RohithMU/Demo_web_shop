package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initDriver();
        DriverFactory.getDriver()
                .get(DriverFactory.prop.getProperty("baseUrl"));
    }

    @After
    public void tearDown() {
        DriverFactory.getDriver().quit();
    }
}
