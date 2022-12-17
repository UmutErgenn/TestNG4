package Gun03;

import Utils._baseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */
public class _0_AdressFunctionality extends _baseDriver {
    By adress = By.linkText("Address Book");
    By addAdressBtn = By.xpath("//a[text()='New Address']");
    By address1 = By.id("input-address-1");
    By radioButtonYes = By.cssSelector("input[type='radio'][value='1']");
    By continueBtn = By.cssSelector("input[type='submit'][value='Continue']");
    By name = By.id("input-firstname");
    By surname = By.id("input-lastname");
    @Test
    void addAdress(){
        WebElement adressBook = driver.findElement(adress);
        adressBook.click();

        WebElement newAdress = driver.findElement(addAdressBtn);
        newAdress.click();

        WebElement adressbox1 = driver.findElement(address1);
        adressbox1.sendKeys("turkey");

        WebElement yes = driver.findElement(radioButtonYes);
        yes.click();

        WebElement continuee = driver.findElement(continueBtn);
        continuee.click();
    }
    @Test
    void editAdress() {
        WebElement adressBook = driver.findElement(adress);
        adressBook.click();

        WebElement newAdress = driver.findElement(addAdressBtn);
        newAdress.click();

        WebElement adressbox1 = driver.findElement(address1);
        adressbox1.sendKeys("tunceli");

        WebElement firstName = driver.findElement(name);
        firstName.clear();
        firstName.sendKeys("flokiragnar");

        WebElement lastName = driver.findElement(surname);
        lastName.clear();
        lastName.sendKeys("ragnarfloki");

        WebElement yes = driver.findElement(radioButtonYes);
        yes.click();

        WebElement continuee = driver.findElement(continueBtn);
        continuee.click();
    }
    @Test
    void deleteAdress(){
        WebElement adressBook = driver.findElement(adress);
        adressBook.click();

        WebElement newAdress = driver.findElement(addAdressBtn);
        newAdress.click();

        WebElement adressbox1 = driver.findElement(address1);
        adressbox1.clear();

        WebElement yes = driver.findElement(radioButtonYes);
        yes.click();

        WebElement continuee = driver.findElement(continueBtn);
        continuee.click();
    }
}
