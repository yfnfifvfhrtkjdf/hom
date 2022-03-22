package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Sandbox")
public class SandboxPage extends WebPage {

    @Name("Краткое описание проблемы")
    private SelenideElement shortDescriptionProblemField = $x("//*[@id='id_title']");

    @Name("Username")
    private SelenideElement userNameField = $x("//*[@id='username']");

    @Name("Password")
    private SelenideElement passwordField = $x("//*[@id='password']");

    @Name("Войти")
    private SelenideElement loginLink = $x("//*[@id='userDropdown']");

    @Name("Вход")
    private SelenideElement enterButton = $x("//*[@value='Login']");

    @Name("Таблица тикетов")
    private SelenideElement ticketTable = $x("//table[@id='ticketTable']");

    @Name("Отправить тикет")
    private SelenideElement createTicket = $x("//*[@id='content-wrapper']/div/div/div/div[2]/form/button");

    @Name("Новый Тикет")
    private SelenideElement newTicketSidebar = $x("//a[@href='/tickets/submit/']");

    @Name("Очередь")
    private SelenideElement queueDropdown = $x("//select[@name='queue']");

    @Name("Описание вашей проблемы")
    private SelenideElement descriptionProblemField = $x("//textarea[@id='id_body']");

    @Name("Приоритет")
    private SelenideElement priority = $x("//*[@id='id_priority']");

    @Name("Выполнить до")
    private SelenideElement doUntil = $x("//*[@id='id_due_date']");

    @Name("Ваш адрес электронной почты")
    private SelenideElement submitterEmail = $x("//*[@id='id_submitter_email']");

    @Name("Изменить тикет")
    private SelenideElement editTicket = $x ("//*[@id='content-wrapper']/div/div[1]/div/div/a/button");

    @Name("Прикрепить файлы")
    private SelenideElement file= $x ("//*[@id='ShowFileUpload']");

    @Name("Добавить файлы")
    private SelenideElement file1= $x ("//*[@id='FileUpload']/dl/dd/div/div/label");

    @Name("Обновить тикет")
    private SelenideElement sub= $x ("//*[@id='content-wrapper']/div/div[3]/div[2]/form/button");

    @Name("Статус")
    private SelenideElement status= $x ("//*[@id='st_closed']");

    @Name("Поиск")
    private SelenideElement search = $x ("//*[@id='search_query']");

    @Name("ПоискGO")
    private SelenideElement searchGo = $x ("//*[@id='searchform']/div/div/button");

    @Name("Сохранить запрос")
    private SelenideElement zapros = $x ("//*[@id='headingTwo']/h5/button");

    @Name("Найденный тикет")
    private SelenideElement tiketTitle = $x ("//div[@class='tickettitle']/a");

    @Name("Сохраненные запросы")
    private SelenideElement searchZapros = $x("//*[@id='ticketsDropdown']");

    @Name("Название запроса")
    private SelenideElement text = $x ("//*[@id='id_title']");

    @Name("Кнопка сохранения запроса")
    private SelenideElement buttonSearch = $x ("//*[@id='collapseTwo']/div/form/div/input");

    @Name("Скролл")
    private SelenideElement scroll = $x ( "//*[@id='wrapper']/ul/li[3]/div/a[61]");


}
