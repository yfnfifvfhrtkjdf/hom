package elements;
import models.Ticket;
import org.openqa.selenium.By;
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

    public void newTicket() {driver.findElement(newTicketBtn).click();}

    public void logIn(){
        driver.findElement(logBtn).click();
    }

    public void searchTicket(Ticket ticket) {
        setSearch(ticket.getTitle()).search();
    }

    public MainMenu setSearch(String text) {
        driver.findElement(searchTitle).sendKeys(text);
        return this;
    }

    public void search() {
        driver.findElement(searchBtn).click();
    }
}
