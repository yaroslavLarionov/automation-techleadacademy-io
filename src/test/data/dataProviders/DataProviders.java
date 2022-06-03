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
    public Object[][] websiteBtns() {
        Object[][] data = new Object[7][2];
        data[0][0] = "PHP Travels";
        data[0][1] = "Demo Script Test drive - PHPTRAVELS";

        data[1][0] = "Mercury tours";
        data[1][1] = "Demoaut.com";

        data[2][0] = "Internet";
        data[2][1] = "The Internet";

        data[3][0] = "E-commerce";
        data[3][1] = "My Store";

        data[4][0] = "Passion Tea Company";
        data[4][1] = "";

        data[5][0] = "Saucedemo";
        data[5][1] = "Swag Labs";

        data[6][0] = "Shopping Cart";
        data[6][1] = "Typescript React Shopping cart";

        return data;
    }
}
