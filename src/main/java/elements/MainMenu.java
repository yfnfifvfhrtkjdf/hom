package elements;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/** Элемент главного меню */
public class MainMenu {
    private WebDriver driver;

    By newTicketBtn = (By.xpath("//*[@id='wrapper']/ul/li[2]/a"));
    By logBtn = (By.xpath("//*[@id='userDropdown']"));
    By searchTitle = (By.xpath("//*[@id='search_query']"));
    By searchBtn = (By.xpath("//*[@class='btn btn-primary']"));

    public MainMenu(WebDriver driver) {
        this.driver = driver;
    }


    @Step("Страница создания нового тикета")
    public void newTicket() {driver.findElement(newTicketBtn).click();
    screenshot();
    }
    @Step("открыть страницу авторизации")
    public void logIn(){
        driver.findElement(logBtn).click();
        screenshot();
    }
    @Step("поиск тикета по имени")
    public void searchTicket(Ticket ticket) {
        setSearch(ticket.getTitle()).search();
    }
    @Step("Ввод имени тикета в поисковую строку")
    public MainMenu setSearch(String text) {
        driver.findElement(searchTitle).sendKeys(text);
       screenshot();
        return this;
    }
    @Step("Ответ поиска")
    public void search() {
        driver.findElement(searchBtn).click();
        screenshot();
    }
    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
