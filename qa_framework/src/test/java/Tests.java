import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tests {

        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        /*@Test
        public void firstTest() {
            driver.get("https://www.sportchek.ca/product/332065104.html#332065104=332065124");

            Select sizeDD = new Select(driver.findElement(By.xpath("//h3[contains(text(), \"size\")]/..//select")));
            Select qtyDD = new Select(driver.findElement(By.xpath("//h3[contains(text(), \"Qty\")]/..//select")));
            WebElement addToCartBtn = driver.findElement(By.xpath("//button/span[contains(text(), 'Add To Cart')]"));


            Actions actions = new Actions(driver);
            actions.moveToElement(addToCartBtn);
            actions.perform();

            sizeDD.selectByIndex(1);
            qtyDD.selectByIndex(1);
            addToCartBtn.click();

            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'has been added')]")));
            Assert.assertTrue("Modal is not displayed!",
                    driver.findElement(By.xpath("//div[contains(text(), 'has been added')]")).isDisplayed());
        }*/

    /*@Test
    public void secondTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        WebElement searchTB = driver.findElement(By.xpath("//input[@name = \"text\"]"));
        searchTB.sendKeys("Nokia");
        searchTB.submit();

        WebElement nokiaRB = driver.findElement(By.xpath("//i[text()=\"Nokia\"]"));
        WebElement velliniCount = driver.findElement(By.xpath("//i[contains(text(), \"Vellini\")]/..//i[contains(@class, \"count\")]"));
        String countText = velliniCount.getText();
        String count = countText.substring(2, countText.length()-1);
        int expectedQnt = Integer.parseInt(count);

        nokiaRB.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//i[text()=\"Vellini\"]"))));
        moveToElement(driver.findElement(By.xpath("//i[text()=\"Vellini\"]")));
        driver.findElement(By.xpath("//i[text()=\"Vellini\"]")).click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@data-location=\"searchResults\"]"));
        Assert.assertTrue("incorrect quantity", searchResults.size()==expectedQnt);
    }*/

    public void moveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

        @After
        public void tearDown(){
            driver.close();
        }



        /*public void waitForElementTobeShown(WebElement webElement) throws InterruptedException {
            if (!webElement.isDisplayed()) {
                driver.wait(20);
            }*/
        }

