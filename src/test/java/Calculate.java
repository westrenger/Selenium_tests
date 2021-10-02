import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculate {
    public WebDriver driver;

    public Calculate(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div")
    private WebElement openParBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")
    private WebElement closeParBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")
    private WebElement plusBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")
    private WebElement minusBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")
    private WebElement divisionBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")
    private WebElement multiplyBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement equalBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")
    private WebElement zeroBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")
    private WebElement oneBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")
    private WebElement twoBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")
    private WebElement threeBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div")
    private WebElement fourBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")
    private WebElement fiveBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")
    private WebElement sexBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")
    private WebElement sinBtn;

    @FindBy(xpath = "//*[@id=\"cwos\"]")
    private WebElement generalDisplay;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")
    private WebElement memoryDisplay;

    public void clickBtn(String btn) {
        switch (btn) {
            case "(":
                openParBtn.click();
                break;
            case ")":
                closeParBtn.click();
                break;
            case "+":
                plusBtn.click();
                break;
            case "-":
                minusBtn.click();
                break;
            case "÷":
                divisionBtn.click();
                break;
            case "*":
                multiplyBtn.click();
                break;
            case "=":
                equalBtn.click();
                break;
            case "0":
                zeroBtn.click();
                break;
            case "1":
                oneBtn.click();
                break;
            case "2":
                twoBtn.click();
                break;
            case "3":
                threeBtn.click();
                break;
            case "4":
                fourBtn.click();
                break;
            case "5":
                fiveBtn.click();
                break;
            case "6":
                sexBtn.click();
                break;
            case "sin":
                sinBtn.click();
                break;
        }
    }

    public String getInfoFromMemoryDisplay() {
        return memoryDisplay.getText();
    }

    public String getInfoFromDisplay() {
        return generalDisplay.getText();
    }
}
