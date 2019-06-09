package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.LoginPage;

public class LoginTest extends AbstractTest {

    @Test
    public void successLoginTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("anitani@o2.pl", "buziaczek4");
        dashboardPage = loginPage.submitLoginForm();
        Assert.assertTrue(dashboardPage.areUserTabsDisplayed());
    }
}