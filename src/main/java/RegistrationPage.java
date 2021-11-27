import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {
    @Test
    public void testRegistrationPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();

        WebElement emailField= driver.findElement(By.id("email_create"));
        WebElement createButton= driver.findElement(By.id("SubmitCreate"));

        emailField.sendKeys("newMyMail@mail.com");
        createButton.click();

        WebElement mrCheckBox=driver.findElement(By.id("id_gender1"));
        mrCheckBox.click();

        WebElement firstName=driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Tom");

        WebElement lastName=driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Soyer");

        WebElement password=driver.findElement(By.id("passwd"));
        password.sendKeys("my-123456");

        WebElement address1=driver.findElement(By.id("address1"));
        address1.sendKeys("Lincoln Avenue 34");

        WebElement city=driver.findElement(By.id("city"));
        city.sendKeys("New York");

        WebElement state=driver.findElement(By.id("id_state"));
        state.click();
        WebElement stateList=driver.findElement(By.cssSelector("#id_state > option:nth-child(34)"));
        stateList.click();

        WebElement postCode=driver.findElement(By.id("postcode"));
        postCode.sendKeys("33880");

        WebElement mobilePhone=driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("123123");

        WebElement submitButton=driver.findElement(By.id("submitAccount"));
        submitButton.click();

        driver.quit();

    }

}
