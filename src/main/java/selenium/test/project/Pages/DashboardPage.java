package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

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

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean areUserTabsDisplayed() {
        return userTabs.isDisplayed();
    }

    public DashboardPage submitSearchForm() {
        clickElement(searchCars);
        return new DashboardPage(driver);
    }

    public DashboardPage searchForDiesels(){
        clickElement(dieselButton);
        return new DashboardPage(driver);
    }

    public DashboardPage goToLoginPage() {
        clickElement(loginButton);
        return new DashboardPage(driver);
    }

    public DashboardPage AddAnnouncement() {
        clickElement(addAnnouncement);
        return new DashboardPage(driver);
    }

}
