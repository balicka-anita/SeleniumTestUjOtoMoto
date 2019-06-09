package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.AddAnnouncementPage;
import selenium.test.project.Pages.DashboardPage;

public class AddAnnouncementTest extends AbstractTest {

    @Test
    public void successAddVersionTest(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.AddAnnouncement();
        AddAnnouncementPage addAnnouncementPage = new AddAnnouncementPage(driver);
        Assert.assertTrue(addAnnouncementPage.isSubmitAnnouncementButtonAvailable());
    }
}
