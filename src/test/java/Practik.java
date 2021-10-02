
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practik {
    private static final String GOOGLE = "http://google.com";
    private static final String CHROMEDRIVER = "C:/Selenium/chromedriver.exe";
    public static WebDriver driver;
    public static FindGoogle findGoogle;
    public static Calculate calculate;

    @Before
    public void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        findGoogle = new FindGoogle(driver);
        calculate = new Calculate(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(GOOGLE);
    }

    @Test
    public void task1() {
        findGoogle.inputFind("Калькулятор");

        calculate.clickBtn("(");
        calculate.clickBtn("1");
        calculate.clickBtn("+");
        calculate.clickBtn("2");
        calculate.clickBtn(")");
        calculate.clickBtn("*");
        calculate.clickBtn("3");
        calculate.clickBtn("-");
        calculate.clickBtn("4");
        calculate.clickBtn("0");
        calculate.clickBtn("÷");
        calculate.clickBtn("5");
        calculate.clickBtn("=");
        String result = calculate.getInfoFromDisplay();
        String memory = calculate.getInfoFromMemoryDisplay();

        Assert.assertEquals("1", result);
        Assert.assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", memory);
    }

    @Test
    public void task2() {
        findGoogle.inputFind("Калькулятор");

        calculate.clickBtn("6");
        calculate.clickBtn("÷");
        calculate.clickBtn("0");
        calculate.clickBtn("=");
        String result = calculate.getInfoFromDisplay();
        String memory = calculate.getInfoFromMemoryDisplay();

        Assert.assertEquals("Infinity", result);
        Assert.assertEquals("6 ÷ 0 =", memory);
    }

    @Test
    public void task3() {
        findGoogle.inputFind("Калькулятор");

        calculate.clickBtn("sin");
        calculate.clickBtn("=");
        String result = calculate.getInfoFromDisplay();
        String memory = calculate.getInfoFromMemoryDisplay();

        Assert.assertEquals("Error", result);
        Assert.assertEquals("sin() =", memory);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
