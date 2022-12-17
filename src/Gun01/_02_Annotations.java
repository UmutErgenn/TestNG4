package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
        @BeforeClass        -->  Class'ın başında çalışacak     (driver işlemleri(static içinde tanımladıklarımız))
            @BeforeMethod       -->  Her metoddan (test metodları) önce çalışacak
                @Test               -->  testlerin çalıştığı metodlar.
            @AfterMethod        -->  Her metoddan sonra çalışacak
        @AfterClass         -->  Class' ın çalışmasının sonunda çalışacak   (driver kapat vb)
    */

    @BeforeClass
    void beforeClass(){
        System.out.println("her class'dan ÖNCE çalışacak");     // test öncesi tüm işlemler burada yapılabilir
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("her metoddan ÖNCE çalışacak");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("her metoddan Sonra");
    }

    @AfterClass
    void afterClass(){
        System.out.println("her class'dan SONRA çalışacak");    // driver kapat vs..
    }

    @Test
    void Test1(){
        System.out.println("test 1 çalıştı");
    }
    @Test
    void Test2(){
        System.out.println("test 2 çalıştı");
    }
}
