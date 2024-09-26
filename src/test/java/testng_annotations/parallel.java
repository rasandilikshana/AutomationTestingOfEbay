package testng_annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class parallel {
    long inittime;
    @BeforeTest
    public void beforeMethod(){
        inittime = System.currentTimeMillis();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Execusion Time :" + (System.currentTimeMillis() - inittime)+ " ms");
    }

    @Test
    public void method1() throws InterruptedException {
        for(int i = 0; i<5; i++){
            Thread.sleep(1000);
            System.out.println("Method 01");
        }
    }

    @Test
    public void method2() throws InterruptedException {
        for(int i = 0; i<5; i++){
            Thread.sleep(3000);
            System.out.println("Method 02");
        }
    }

}
