package hrm.pages;

import net.serenitybdd.annotations.Step;

public class Homepage {

    OrangeHRMHomepage home;

    @Step("Verify the title")
    public void verifyTitle(){
        home.verifyTitle();
    }

    @Step("allow us to login application")
    public void enterCredentials(){
        home.enterUsernamePassword();
    }

    @Step("verify the dashboard")
    public void verifyDashboard(){
        home.verifyLogin();
    }
}
