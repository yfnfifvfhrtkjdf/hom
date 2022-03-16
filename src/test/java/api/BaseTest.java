package api;
import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.Random;
import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.given;

//import static io.restassured.RestAssured.given;

/** Абстрактный класс, содержащий общие для всех тестов методы */
public abstract class BaseTest {
    @BeforeClass
    public void prepare() throws IOException {
        // todo: загрузить в системные переменные "base.uri" из "config.properties"
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
       baseURI=System.getProperty("base.uri");
      // authentication= (AuthenticationScheme) login();
        if (baseURI == null || baseURI.isEmpty()) {
            throw new RuntimeException("В файле \"config.properties\" отсутствует значение \"base.uri\"");
        }
        // todo: подготовить глобальные преднастройки для запросов
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseURI)
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setAuth(authentication)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }
    // todo: отправить запрос на получения токена, используя учетные данные из "config.properties"
    protected AuthToken login() {
        AuthToken authToken=new AuthToken();
        String username = System.getProperty("username");
        String password = System.getProperty("password");
        authToken.setUsername(username);
        authToken.setPassword(password);
             AuthToken token = given()
                     .body(authToken)
                     .when().post("/api/login")
                     .then().statusCode(201)
                     .extract().as(AuthToken.class);
       return token;
    }

    protected Ticket buildNewTicket(Status status, int priority) {
        Ticket ticket = new Ticket();
        int queue = 2;
        String title ="title";
        ticket.setTitle(title);
        ticket.setStatus(status.getCode());
        ticket.setPriority(priority);
        ticket.setQueue(queue);
        // todo: создать объект с тестовыми данными
        return ticket;
    }

    protected Ticket createTicket(Ticket ticket) {
        ticket = given()
                .body(ticket)
                .when().post("/api/tickets")
                .then().statusCode(201)
                .extract().as(Ticket.class);
        return ticket;
    }
}