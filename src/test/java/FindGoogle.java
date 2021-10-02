import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindGoogle {
    public WebDriver driver;

    public FindGoogle(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'gLFyf gsfi')]")
    private WebElement findField;

    public void inputFind(String find) {
        findField.sendKeys(find+"\n");
    }

}

