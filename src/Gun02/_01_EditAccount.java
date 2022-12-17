package Gun02;

import Utils._baseDriver;
import Utils._tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız.
  3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
 */
public class _01_EditAccount extends _baseDriver {

    By link = By.linkText("Edit Account");
    By name = By.id("input-firstname");
    By surname = By.id("input-lastname");
    By cnt = By.cssSelector("[value='Continue']");


    @Test
    void editAccount(){
        editAccountTest("Flokii","Carpenterr");
        _tools.Bekle(2);
        editAccountTest("Floki","Carpenter");
    }

    void editAccountTest(String ad,String soyad){
        WebElement edit=driver.findElement(link);
        edit.click();

        WebElement firstName = driver.findElement(name);
        firstName.clear();
        firstName.sendKeys(ad);

        WebElement lastName = driver.findElement(surname);
        lastName.clear();
        lastName.sendKeys(soyad);

        WebElement continueBtn = driver.findElement(cnt);
        continueBtn.click();

        _tools.successMsgValidation();
    }

}
