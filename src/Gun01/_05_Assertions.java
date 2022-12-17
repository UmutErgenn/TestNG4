package Gun01;

import Utils._baseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class _05_Assertions {
    @Test
    void equalOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba1";
                            // Actual,Expected(beklenen),Message(opsiyonel)
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");      // hard assertion,hata varsa testi keser.soft assertion testin sonunda hataları gösterir.
    }

    @Test
    void notEqualOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");
    }

    @Test
    void trueOrnek(){
        int s1 = 55;
        int s2 = 66;

        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");
    }

    @Test
    void nullOrnek(){
        String s1="umut";

        Assert.assertNull(s1,"işlem sonucu");
    }

    @Test
    void directFail(){
        int a = 55;

        if (a==55)
            Assert.fail();
    }
}
