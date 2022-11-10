package baseTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddUserPage;

public class AddUserTest extends BaseTests {

    private AddUserPage addUserPage;


    @Test(priority = 1, dataProvider = "UserData")
    public void userAdd(String InputFirstName, String InputLastName, String InputUserName, String InputPassword, String InputEmail, String InputCellphone) {
        AddUserPage usersTest = homePage.addUser();
        usersTest.setInputFirstName(InputFirstName);
        usersTest.setInputLastName(InputLastName);
        usersTest.setInputUserName(InputUserName);
        usersTest.setInputPassword(InputPassword);
        usersTest.setInputCustomer();
        usersTest.setInputRole();
        usersTest.setInputEmail(InputEmail);
        usersTest.setInputCellphone(InputCellphone);
        usersTest.setClickButton();
    }

    @Test(priority = 2, dataProvider = "UserData2")
    public void userAdd2(String InputFirstName, String InputLastName, String InputUserName, String InputPassword, String InputEmail, String InputCellphone) {
        AddUserPage usersTest = homePage.addUser();
        usersTest.setInputFirstName(InputFirstName);
        usersTest.setInputLastName(InputLastName);
        usersTest.setInputUserName(InputUserName);
        usersTest.setInputPassword(InputPassword);
        usersTest.setInputCustomer();
        usersTest.setInputRole2();
        usersTest.setInputEmail(InputEmail);
        usersTest.setInputCellphone(InputCellphone);
        usersTest.setClickButton();
    }


    @DataProvider
    public Object[][] UserData() {
        Object[][] data = new Object[1][6];

        data[0][0] = "FName1";
        data[0][1] = "LName1";
        data[0][2] = "User1";
        data[0][3] = "Pass1";
        data[0][4] = "admin@mail.com";
        data[0][5] = "082555";


        return data;

    }

    @DataProvider
    public Object[][] UserData2() {
        Object[][] data = new Object[1][6];


        data[0][0] = "FName2";
        data[0][1] = "LName2";
        data[0][2] = "User2";
        data[0][3] = "Pass2";
        data[0][4] = "customer@mail.com";
        data[0][5] = "083444";


        return data;

    }
}
