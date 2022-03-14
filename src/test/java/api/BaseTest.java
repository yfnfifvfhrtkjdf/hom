package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

//import static io.restassured.RestAssured.given;

/** Абстрактный класс, содержащий общие для всех тестов методы */
public abstract class BaseTest {
    @BeforeClass
    public void prepare() throws IOException {
        // todo: загрузить в системные переменные "base.uri" из "config.properties"
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        String baseUri = System.getProperty("https://at-sandbox.workbench.lanit.ru/");
        if (baseUri == null || baseUri.isEmpty()) {
            throw new RuntimeException("В файле \"config.properties\" отсутствует значение \"base.uri\"");
        }
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://at-sandbox.workbench.lanit.ru/")
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
        // todo: подготовить глобальные преднастройки для запросов
    }

    protected AuthToken login() {
        // todo: отправить запрос на получения токена, используя учетные данные из "config.properties"
        return null;
    }

    protected Ticket buildNewTicket(Status status, int priority) {
        // todo: создать объект с тестовыми данными
        return null;
    }

    protected Ticket createTicket(Ticket ticket) {
        // todo: отправить HTTP запрос для создания тикета
        return null;
    }
}