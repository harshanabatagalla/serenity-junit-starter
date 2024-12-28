package testcases;

import hrm.pages.Homepage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginWithPageObjectTestCase {

    @Managed
    WebDriver driver;

    @Steps
    Homepage home;

    @Test
    public void loginAsAdmin() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        home.verifyTitle();
        home.enterCredentials();
        home.verifyDashboard();
    }
}
