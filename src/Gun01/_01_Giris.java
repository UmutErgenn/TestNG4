package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
//     eğer herhangi bir sıralama verilmezse alfabetik çalışıyor
    @Test(priority = 1)     // öncelik sırası
    void webSitesiniAc()
    {
        System.out.println("driver tanımlandı ve web sitesi açıldı");
    }
    @Test(priority = 2)
    void loginIsleminiYap()
    {
        System.out.println("login test işlemleri yapıldı");
    }
    @Test(priority = 3)
    void driveriKapat()
    {
        System.out.println("driver kapatıldı ve çıkıldı");
    }
}
