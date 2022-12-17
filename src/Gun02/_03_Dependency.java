package Gun02;

import Utils._baseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Dependency {
    @Test
    void startCar(){
        System.out.println("startCar");
//        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})  // bu testin çalışması, startCar'ın hatasız çalışmasına bağımlıdır.startCar hatasız çalışmadığı sürece bu test çalışmaz.
    void driveCar(){
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})       // aynı dependency'e sahip testler arasında da priority atayarak çalışma sırasını belirleyebiliriz
    void parkCar(){
        System.out.println("parkCar");
    }
    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)     // alwaysRun = true -> bağımlılıkları var ama hata çıkarsa da yine çalıştır.
    void stopCar(){
        System.out.println("stopCar");      // bu şekilde çalışma sıraları hem bağımlı hem sıralı olmuş oluyor
    }
}
//      aynı seviyedeki testler iççin priority verilebilir
//      bağımlı testler, direk metodundan çalıştırıldığında bağımlı olduğu metod zincirinde 2 üstüne kadar otomatik çağırıp çalıştırabilir.