package data.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "Role info")
    public Object[][] roleInfo() {
        Object[][] data = new Object[3][5];
        data [0][0] = "John";
        data [0][1] = "Brown";
        data [0][2] = "1111111";
        data [0][3] = "jbrown@test.com";
        data [0][4] = "Student";

        data [1][0] = "Michael";
        data [1][1] = "Scott";
        data [1][2] = "22222222";
        data [1][3] = "mscott@test.com";
        data [1][4] = "Instructor";

        data [2][0] = "Celina";
        data [2][1] = "Kyle";
        data [2][2] = "33333333";
        data [2][3] = "ckyle@test.com";
        data [2][4] = "Mentor";

        return data;
    }

    @DataProvider(name = "buttonNames")
    public Object[] websiteBtns() {
        Object[] data = {"PHP Travels", "Mercury tours", "Internet", "E-commerce", "Passion Tea Company", "Saucedemo", "Shopping Cart"};
        return data;
    }
}
