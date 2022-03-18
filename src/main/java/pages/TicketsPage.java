package pages;
import models.Ticket;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/** Страница со списком тикетов */
public class TicketsPage extends HelpdeskBasePage {
    By search = (By.xpath("//div[@class='tickettitle']/a"));
    // todo: элементы страницы поиска тикетов

    public TicketsPage() {
        PageFactory.initElements(driver, this);
    }
    /** Ищем строку с тикетом и нажимаем на нее */
    public void openTicket() {
       driver.findElement(search).click();
        // todo: найти и открыть тикет
    }
}
