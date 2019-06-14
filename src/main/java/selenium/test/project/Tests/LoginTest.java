package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.SearchPage;
import selenium.test.project.Pages.LoginPage;

public class LoginTest extends AbstractTest {

    @Test
    public void successLoginTest() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("anitani@o2.pl", "buziaczek4");
        searchPage = loginPage.submitLoginForm();
        Assert.assertTrue(searchPage.areUserTabsDisplayed());
    }
}