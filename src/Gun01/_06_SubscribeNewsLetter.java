package Gun01;

import Utils._baseDriver;
import Utils._tools;
import Utils._tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_SubscribeNewsLetter extends _baseDriver {
    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
 */

    By link = By.linkText("Newsletter");
    By yes = By.cssSelector("[type='radio'][value='1']");
    By cnt = By.cssSelector("input[type='submit'][value='Continue']");
    By no = By.cssSelector("[type='radio'][value='0']");

    @Test(priority = 1)
    void subscribeFunctionYes(){
        WebElement newsLetter = driver.findElement(link);
        newsLetter.click();

        WebElement subscribeYes = driver.findElement(yes);
        subscribeYes.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        _tools.successMsgValidation();
    }

    @Test(priority = 2)
    void subscribeFunctionNo(){
        WebElement newsLetter = driver.findElement(link);
        newsLetter.click();

        WebElement subscribeNo = driver.findElement(no);
        subscribeNo.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        _tools.successMsgValidation();
    }

    @Test(priority = 3)
    void subscribeFunctionForBoth(){
        WebElement newsLetter = driver.findElement(link);
        newsLetter.click();

        WebElement subscribeYes = driver.findElement(yes);
        WebElement subscribeNo = driver.findElement(no);

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        _tools.successMsgValidation();
    }
}
