package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.SearchResultsPage;

public class SearchResultsPageTest extends AbstractTest {

    @Test
    public void successSearchDieselsTest(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.searchForDiesels();
        dashboardPage.submitSearchForm();
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        Assert.assertEquals(searchResultsPage.fuelType.getText(), "Diesel" );
    }
}
