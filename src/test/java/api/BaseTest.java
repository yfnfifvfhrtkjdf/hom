package api;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.given;


/** Абстрактный класс, содержащий общие для всех тестов методы */
public abstract class BaseTest {
    @BeforeClass
    public void prepare() throws IOException {
        // todo: загрузить в системные переменные "base.uri" из "config.properties"
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
       baseURI=System.getProperty("base.uri");
       //authentication= Ticket.token;
        if (baseURI == null || baseURI.isEmpty()) {
            throw new RuntimeException("В файле \"config.properties\" отсутствует значение \"base.uri\"");
        }

        // todo: подготовить глобальные преднастройки для запросов

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseURI)
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
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
                     .then().statusCode(200)
                     .extract().jsonPath().getObject("AuthToken", AuthToken.class);
       return token;}

    protected Ticket buildNewTicket(Status status, int priority) {
        Ticket ticket = new Ticket();
        int queue = 2;
        String title ="title";
        ticket.setTitle(title);
        ticket.setStatus(status.getCode());
        ticket.setPriority(priority);
        ticket.setQueue(queue);
        return ticket;}

    protected Ticket createTicket(Ticket ticket) {
                 given()
                .body(ticket)
                .when().post("/api/tickets")
                .then().statusCode(201)
                         .extract().body()
                         .as(Ticket.class);
        return null;
    }
}