import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PurchaseItemPage {
    @Test
    public void testPurchaseItemPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginButton = driver.findElement(By.className("login"));
        loginButton.click();

        WebElement emailField= driver.findElement(By.id("email"));
        emailField.sendKeys("newMyMail@mail.com");

        WebElement password=driver.findElement(By.id("passwd"));
        password.sendKeys("my-123456");

        WebElement signInButton= driver.findElement(By.id("SubmitLogin"));
        signInButton.click();

        WebElement womenCategory=driver.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Women']"));
        womenCategory.click();

        WebElement blouse=driver.findElement(By.xpath("//*[@data-id-product='2']/span"));
        blouse.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement  proceedChekoutButton1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='layer_cart']//div[@class='button-container']/a")));
        proceedChekoutButton1.click();

        WebElement  proceedChekoutButton2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*/p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")));
        proceedChekoutButton2.click();

        WebElement  proceedChekoutButton3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='processAddress']")));
        proceedChekoutButton3.click();

        WebElement agreeCheckBox=driver.findElement(By.id("cgv"));
        agreeCheckBox.click();

        WebElement  proceedChekoutButton4= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='processCarrier']")));
        proceedChekoutButton4.click();

        WebElement payMeyhodButton=driver.findElement(By.className("bankwire"));
        payMeyhodButton.click();

        WebElement confirmOrderButton=driver.findElement(By.xpath("//*[@id='cart_navigation']/button[@type='submit']"));
        confirmOrderButton.click();

        WebElement backButton=driver.findElement(By.xpath("//*/p[@class='cart_navigation exclusive']/a[@title='Back to orders']"));
        backButton.click();

        driver.quit();

    }
}
