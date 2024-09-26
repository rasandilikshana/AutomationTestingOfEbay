package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

    @Test
    public void logIn(){
        System.out.println("User login function");
    }

    @Test
    public void regsiter(){
        System.out.println("User registration function");
    }

    @Test(dataProvider = "getUserDetails",enabled = false)
    public void validateUser(String username, String password){
        System.out.printf("Username is : %s and Password is : %s \n", username, password);
    }

    @DataProvider
    public Object[][] getUserDetails(){
        // Object array holding the user credentials
        Object[][] userDetails = new Object[][]{
                {"Upul", "Upul123"},
                {"Amod", "Amod@6891"},
                {"Aruni", "Arun_5757"},
                {"Chamil", "Chamil9898"},
        };

        return userDetails;
    }
}
