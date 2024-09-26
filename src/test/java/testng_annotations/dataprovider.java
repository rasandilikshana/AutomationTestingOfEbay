package testng_annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    @Test(dataProvider = "stdDataProvider")
    public  void showStdDetails(String name, int age){
        System.out.printf("Student name is %s and age is %d \n", name, age);
    }

    @DataProvider
    public Object[][] stdDataProvider(){
        Object[][] studentData = new Object[][]{
                {"Amila", 35},
                {"Amila", 35},
                {"Amila", 35},
        };

        return  studentData;
    }
}
