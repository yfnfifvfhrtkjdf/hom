package pages;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/** Страница авторизации */
public class LoginPage extends HelpdeskBasePage  {

    By name = (By.xpath("//*[@id='username']"));
    By pass = (By.xpath("//*[@id='password']"));
    By log = (By.xpath("//*[@value='Login']"));

    @Step("Ввод данных для авторизации и вход в систему")
    public void login(String user, String password) {
        driver.findElement(name).sendKeys(user);
        driver.findElement(pass).sendKeys(password);
        screenshot();
        driver.findElement(log).click();
    }
    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
