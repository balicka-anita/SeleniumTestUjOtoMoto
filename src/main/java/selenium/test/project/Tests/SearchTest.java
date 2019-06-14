package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.SearchPage;
import selenium.test.project.Pages.SearchResultsPage;

public class SearchTest extends AbstractTest {

    @Test
    public void successfulSearchDieselsTest() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchForDiesels();
        searchPage.submitSearchForm();
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        Assert.assertEquals(searchResultsPage.fuelType.getText(), "Diesel");
    }

    @Test
    public void searchResultsTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickSearchButton();
        Thread.sleep(6000);
        Assert.assertTrue(driver.getPageSource().contains("Samochody osobowe nowe i używane na sprzedaż"));
    }

    @Test
    public void offertOfTheDayTest() {
        SearchPage searchPage = new SearchPage(driver);

        Assert.assertEquals("OFERTA DNIA", searchPage.getOfferOfTheDayLabelText());

    }

    @Test(enabled = false)
    public void searchResultsBmwTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        String selectedBrand = "bmw";
        Thread.sleep(6000);

        searchPage.selectBrand(selectedBrand);

        Thread.sleep(6000);
        searchPage.clickSearchButton();
    }
}
