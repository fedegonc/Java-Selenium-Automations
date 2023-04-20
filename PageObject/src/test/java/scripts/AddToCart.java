package scripts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

import static org.testng.AssertJUnit.assertEquals;

public class AddToCart {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

        @Test
        public void test() {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
            WebDriver driver = new ChromeDriver();

            driver.get("http://opencart.abstracta.us/");
            HomePage homePage = new HomePage(driver);
            ProductPage change = homePage.changeCurrency();
            ProductPage product = homePage.click("MacBook");
            assertEquals(product.getPrice(), "$602.00");
            ProductPage buttonCart = ProductPage.addToCart();
            assertEquals(product.getValue(), " 1 item(s) - $602.00");


        }

    @AfterClass
    public static void tearDown() {

        driver.quit();
    }
    }
