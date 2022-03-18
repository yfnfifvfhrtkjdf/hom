package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/** Страница авторизации */
public class LoginPage extends HelpdeskBasePage  {

    By name = (By.xpath("//*[@id='username']"));
    By pass = (By.xpath("//*[@id='password']"));
    By log = (By.xpath("//*[@value='Login']"));

    public void login(String user, String password) {
        driver.findElement(name).sendKeys(user);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(log).click();

    }
}
