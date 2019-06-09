package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends AbstractPage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "save")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"param_fuel_type\"]/div/div/span/span[1]/span/div")
    public WebElement fuelType;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

}
