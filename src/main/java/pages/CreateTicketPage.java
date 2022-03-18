package pages;
import models.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/** Страница создания тикета */
public class CreateTicketPage extends HelpdeskBasePage {

    // Способ объявления элементы страницы, через аннотацию
    @FindBy(xpath = "//*[@id='id_queue']")
    private WebElement tQueue;

    @FindBy(xpath = "//*[@id='id_title']")
    private WebElement Title;

    @FindBy(xpath = "//*[@id='id_body']")
    private WebElement Description;

    @FindBy(xpath = "//*[@id='id_priority']")
    private WebElement Priority;

    @FindBy(xpath = "//*[@id='id_due_date']")
    private WebElement Due_date;

    @FindBy(xpath = "//*[@id='id_attachment']")
    private WebElement AttachmentFile;

    @FindBy(xpath = "//*[@id='id_submitter_email']")
    private WebElement SubmitEmail;

    @FindBy(xpath = "//*[@id='id_assigned_to']")
    private WebElement Assigned_to;

    @FindBy(xpath = "//*[@id='content-wrapper']/div/div/div/div[2]/form/button")
    private WebElement SubmitTicket;

    public CreateTicketPage(WebDriver driver){
        AbstractPage.driver = driver;
        PageFactory.initElements(driver, this);}


    /** Создание тикета */
    public void createTicket(Ticket ticket) {
        setProblemTitle(ticket.getTitle());
        setDescriptionIssue(ticket.getDescription());
        setDue_on(ticket.getDue_date());
        setQueue(ticket.getQueue());
        setPriority(ticket.getPriority());
        setEmail(ticket.getSubmitter_email());
        // todo: заполнение остальных полей
        createTicket();
    }

    /** Заполнение поля "Summary of the problem" */
    public void setProblemTitle(String text) {
        Title.sendKeys(text);
        // todo: заполнить поле
    }
    public void setDescriptionIssue(String text) {
        Description.sendKeys(text);
    }
    public void setDue_on(String text) {
        Due_date.click();
        List<WebElement> call = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
        for( WebElement a : call){
            if(a.getText().equals(text)){
                a.click();
            }
        }
    }
    public void setQueue(Integer number) {
        Select s = new Select(tQueue);
        s.selectByValue(String.valueOf(number));
    }
    public void setPriority(int number) {
        Select s = new Select(Priority);
        s.selectByValue(String.valueOf(number));
    }
    public void setEmail(String text) {
        SubmitEmail.sendKeys(text);
    }

    public void setKbitem(int number) {
        AttachmentFile.sendKeys(String.valueOf(number));
    }

    public void setAssigned_to(String text){
        Assigned_to.sendKeys(text);
    }

    // todo: методы заполнения остальных полей

    /** Зажатие кнопки "Submit Ticket" */
    public void createTicket() {
        {
            SubmitTicket.click();
        }
    }
        // todo: нажать кнопку создания задания
    }

