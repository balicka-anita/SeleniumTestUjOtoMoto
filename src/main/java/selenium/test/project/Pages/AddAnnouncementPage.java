package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAnnouncementPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"save\"]")
    private WebElement submitAnnouncement;

    public AddAnnouncementPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSubmitAnnouncementButtonAvailable () {
        return submitAnnouncement.isDisplayed();
    }

}
