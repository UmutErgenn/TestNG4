package Gun03;

import org.testng.annotations.*;

public class _01_Intro {
    /*
                @BeforeSuit     // tüm testler başlamadan önce yapılanlar
                    @BeforeGroup
                        @BeforeClass
                            @BeforeMethod
                                @Test1  method
                                @Test2  method
                            @AfterMethod
                        @AfterClass
                    @AfterGroup
                @AfterSuit  //  tüm testlerden sonra yapılanlar
     */

    @BeforeSuite
    void bSuit(){System.out.println("BeforeSuit");}

    @BeforeTest
    void bTest(){System.out.println("BeforeTest");}

    @BeforeGroups
    void bGroups(){System.out.println("Before Groups");}

    @BeforeClass
    void bClass(){System.out.println("Before Class");}

    @BeforeMethod
    void bMethod(){System.out.println("Before Method");}

    @Test
    void Intro1_Test1(){System.out.println("Test1");}

    @Test
    void Intro1_Test2(){System.out.println("Test2");}

    @AfterMethod
    void aMethod(){System.out.println("After Method");}

    @AfterClass
    void aClass(){System.out.println("After Class");}

    @AfterGroups
    void aGroups(){System.out.println("After Groups");}

    @AfterTest
    void aTest(){System.out.println("After Test");}

    @AfterSuite
    void aSuit(){System.out.println("After Suit");}

    /*
    BeforeSuit
    BeforeTest
    Before Class

    Before Method
    Test1
    After Method

    Before Method
    Test2
    After Method

    After Class
    After Test
    After Suit
    */

}
