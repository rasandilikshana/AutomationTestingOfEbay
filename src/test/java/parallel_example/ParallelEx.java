package parallel_example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelEx {

    long initTime;

    // @BeforeTest will run once before executing the tests
    @BeforeTest
    public void getInitTime(){
        // This line will save the start time
        initTime = System.currentTimeMillis();
    }

    @AfterTest
    public void getTotalTime(){
        //long endTime = System.currentTimeMillis();
        //System.out.println("The difference is: " + (endTime-initTime));
        System.out.println("The difference is "+ (System.currentTimeMillis()-initTime));
    }
    @Test
    public void method1() throws InterruptedException {
        for (int x = 0; x<5; x++){
            //sleep() method adds a delay
            Thread.sleep(1000);
            System.out.println("Method - 01");
        }

    }

    @Test
    public void method2() throws InterruptedException {
        for (int x = 0; x<5; x++){
            //sleep() method adds a delay
            Thread.sleep(4000);
            System.out.println("Method - 02");
        }
    }

    @Test
    public void method3() throws InterruptedException {
        for (int x = 0; x<5; x++){
            //sleep() method adds a delay
            Thread.sleep(3000);
            System.out.println("Method - 03");
        }
    }

    @Test
    public void method4() throws InterruptedException {
        for (int x = 0; x<5; x++){
            //sleep() method adds a delay
            Thread.sleep(2000);
            System.out.println("Method - 04");
        }
    }


}
