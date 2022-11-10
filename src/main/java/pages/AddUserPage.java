package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {

    private WebDriver driver;

    private By inputFirstName = By.name("FirstName");
    private By inputLastName =By.name("LastName");
    private By inputUserName =By.name("UserName");
    private By inputPassword =By.name("Password");
    private By inputCustomer=By.xpath("//input[@name='optionsRadios']");
    private By inputRole = By.xpath("//option[@value='2']");
    private By inputRole2=By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[3]");
    private By inputEmail =By.name("Email");
    private By inputCellphone =By.name("Mobilephone");
    private By clickButton= By.cssSelector("body > div.modal.ng-scope > div.modal-footer > button.btn.btn-success");



    public AddUserPage(WebDriver driver){
        this.driver=driver;

    }

    public void setInputFirstName(String name){
        driver.findElement(inputFirstName).sendKeys(name);
    }

    public  void setInputLastName(String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
    }

    public void setInputUserName (String userName){
        driver.findElement(inputUserName).sendKeys(userName);
    }

    public void setInputPassword (String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void setInputCustomer(){
        driver.findElement(inputCustomer).getSize();

    }

    public void setInputRole(){
        driver.findElement(inputRole).click();
    }

    public void setInputRole2() {
        driver.findElement(inputRole2).click();

    }

    public void setInputEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setInputCellphone(String mobileNumber){
              driver.findElement(inputCellphone).sendKeys(mobileNumber);
    }

    public void setClickButton(){
        driver.findElement(clickButton).click();
    }


}
