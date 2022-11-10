package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By clickAddUserButton = By.cssSelector("body > table > thead > tr:nth-child(2) > td > button");


    public HomePage(WebDriver driver){
        this.driver=driver;


    }

    public AddUserPage addUser(){
        driver.findElement(clickAddUserButton).click();
        return new  AddUserPage(driver);
    }




}
