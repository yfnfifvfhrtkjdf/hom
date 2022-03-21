package web;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import static io.restassured.RestAssured.baseURI;
@Epic("Главное меню")
public class HelpdeskUITest {
    private WebDriver driver;
    private Ticket ticket;

    @BeforeClass
    public void setup() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("user.properties"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AbstractPage.setDriver(driver);
    }

    @Test
    public void createTicketTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MainPage main = new MainPage();
        driver.get("https://at-sandbox.workbench.lanit.ru/");
        CreateTicketPage newTicket = new  CreateTicketPage(driver);
        main.mainMenu().newTicket();
        ticket = buildNewTicket();
        newTicket.createTicket(ticket);

        main.mainMenu().logIn();
        Thread.sleep(2000);
        LoginPage login = new LoginPage();
        login.login(System.getProperty("user"), System.getProperty("password"));

        main.mainMenu().searchTicket(ticket);
        TicketsPage findTicket = new TicketsPage();
        findTicket.openTicket();
        TicketPage findColumn = new TicketPage();

        Assert.assertEquals(findColumn.getPriority(),ticket.getPriority(),"не равны");
        Assert.assertEquals(findColumn.getEmail(),ticket.getSubmitter_email(),"не равны");
        Assert.assertEquals(findColumn.getDescription(),ticket.getDescription(),"не равны");
        driver.close();
    }

    protected Ticket buildNewTicket() {
        Ticket ticket = new Ticket();
        ticket.setTitle("WOOOW");
        ticket.setDescription("PROBLEM");
        ticket.setDue_date("7");
        ticket.setPriority(5);
        ticket.setQueue(1);
        ticket.setSubmitter_email("momomo@mail.ru");
        return ticket;
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}