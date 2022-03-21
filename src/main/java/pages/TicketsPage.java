package pages;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

/** Страница со списком тикетов */
public class TicketsPage extends HelpdeskBasePage {
    By search = (By.xpath("//div[@class='tickettitle']/a"));

    public TicketsPage() {
        PageFactory.initElements(driver, this);
    }
    @Step("Открыть найденный тикет")
    public void openTicket() {
       driver.findElement(search).click();
       screenshot();
    }

    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
