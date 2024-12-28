package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginScenarioTestCase extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void LoginScenarioTestCase() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElementFacade username = $(By.name("username"));
        username.type("Admin");
        WebElementFacade password = $(By.name("password"));
        password.typeAndEnter("admin123");
    }
}
