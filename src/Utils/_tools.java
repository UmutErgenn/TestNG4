package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _tools extends _baseDriver{
    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);      // thread sleep java'ya ait, programı bekletme komutudur.bu komt sadece debug yaparken kullanılır.
        }                                        // biz selenium'un özel komutlarını kullanacağız,bunu kullanmayacağız.
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void  successMsgValidation(){
        WebElement msg2Label = driver.findElement(By.xpath("//*[text()=' Success: Your account has been successfully updated.']"));
        Assert.assertTrue(msg2Label.getText().toLowerCase().contains("success"));
    }

}
