package selenium.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchPage extends AbstractPage {

    //@FindBy(xpath = "//*[@id=\"se_userLogin\"]")
    @FindBy(xpath = "//*[@id=\"siteWrap\"]/div[1]/div/div[3]")
    private WebElement userTabs;

//    @FindBy(xpath = "//html/body/aside/div/ul/li[4]")
//    private WebElement environmentsMenuLink;

//    @FindBy(xpath = "//html/body/aside/div/ul/li[5]")
//    private WebElement versionsMenuLink;

    @FindBy(xpath = "//*[@id=\"topLoginLink\"]/span")
    private WebElement loginButton;

//    @FindBy(xpath = "//*[@id=\"select2-param571-container\"]")
//    private WebElement makeDropDown;

    @FindBy(xpath = "//*[@id=\"searchmain_29\"]/button[1]/span[1]")
    private WebElement searchCars;

    //@FindBy(xpath = "//*[@id=\"searchmain_29\"]/div[7]/span[3]")
    @FindBy(css = "span[data-key='diesel']")
    private WebElement dieselButton; //unable to find element !!!

    @FindBy(xpath = "//*[@id=\"siteWrap\"]/header/div/div[1]/a")
    private WebElement addAnnouncement;

    @FindBy(className = "search-area__button-submit")
    private List<WebElement> buttons;

    @FindBy(css = ".offers-box.offer-big strong")
    private WebElement offerOfTheDayLabel;

//    @FindBy(className = "visible-xs-inline")
//    private ;

    private Select brandSelect;

    public SearchPage(WebDriver driver) {
        super(driver);
        brandSelect = new Select(driver.findElement(By.name("search[filter_enum_make]")));

    }

    public void clickSearchButton() {
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", buttons.get(0));
    }

    public void selectBrand(String selectedBrand) {
        brandSelect.selectByValue(selectedBrand);
    }

    public boolean areUserTabsDisplayed() {
        return userTabs.isDisplayed();
    }

    public SearchPage submitSearchForm() {
        clickElement(searchCars);
        return new SearchPage(driver);
    }

    public SearchPage searchForDiesels() {
        clickElement(dieselButton);
        return new SearchPage(driver);
    }

    public SearchPage goToLoginPage() {
        clickElement(loginButton);
        return new SearchPage(driver);
    }

    public SearchPage AddAnnouncement() {
        clickElement(addAnnouncement);
        return new SearchPage(driver);
    }

    public String getOfferOfTheDayLabelText() {
        return offerOfTheDayLabel.getText();
    }
}
