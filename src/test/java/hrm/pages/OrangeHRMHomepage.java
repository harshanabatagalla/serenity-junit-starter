package hrm.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrangeHRMHomepage extends PageObject {

    public void verifyTitle(){
        String title = getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));
    }

    public void enterUsernamePassword(){
        $(By.name("username")).type("Admin");
        $(By.name("password")).typeAndEnter("admin123");
    }

    public void verifyLogin(){
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));
    }
}
