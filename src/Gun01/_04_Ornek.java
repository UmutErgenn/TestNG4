package Gun01;

import Utils._baseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Ornek extends _baseDriver {

    @Test
    void loginTest()
    {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        System.out.println("login test");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("FlokiTheCarpenter@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456789");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(),"My Account","Login Başarısız");
    }
}
