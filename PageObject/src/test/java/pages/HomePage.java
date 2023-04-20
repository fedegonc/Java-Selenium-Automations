package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

        private static WebDriver driver;

        public HomePage(WebDriver driver){
            HomePage.driver = driver;
            PageFactory.initElements(driver, this);
        }


        @FindBy(id = "form-currency")
        private WebElement currencyForm;

        @FindBy(name = "USD")
        private WebElement usdButton;

        public ProductPage changeCurrency(){
        currencyForm.click();
        usdButton.click();

            return null;
        }

    public ProductPage click(String product){
        WebElement productLink=driver.findElement(By.linkText(product));
        productLink.click();
        return new ProductPage(driver);
    }

}

