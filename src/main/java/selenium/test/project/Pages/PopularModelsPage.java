package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.project.Pages.AbstractPage;

public class PopularModelsPage extends AbstractPage {

    @FindBy (xpath = "/html/body/div[3]/main/div[7]/div[2]/div[6]/ol/li[10]/a")
    private WebElement addPopularLink;

    public PopularModelsPage(WebDriver driver) {
        super(driver);
    }


//    @FindBy (xpath = "/html/body/div[4]/div[2]/div[1]/div/div/ul[1]/li[3]/a/span[1]/span" )
//    private  WebElement
}

