package api;

import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.objectMapper;


/** Обновление тикета */
public class UpdateTicketTest extends BaseTest {
    @Test
    public void updateTicketTest() throws IOException {

    AuthToken authToken = new AuthToken();
    authToken.setToken(System.getProperty("token"));
    Ticket ticket = new Ticket();
    int queue = 2;
    String title = "title";
    ticket.setTitle(title);
    ticket.setQueue(queue);
    ticket.setPriority(2);
    ticket.setStatus(Status.CLOSED.getCode());
    int open = Status.OPEN.getCode();
    int close = Status.CLOSED.getCode();
    ticket = given()
            .body(ticket)
            .when()
            .post("/api/tickets")
            .then()
            .statusCode(201)
            .extract().body()
            .as(Ticket.class);
    Ticket negative = given()
            .header("Authorization", "token " + authToken.getToken())
            .pathParam("id", ticket.getId())
            .queryParam("status", open)
            .when().patch("/api/tickets/{id}")
            .then().statusCode(200)
            .extract().as(Ticket.class);
    }

    private void updateTicketNegative(Ticket ticket) {
        AuthToken authToken =new  AuthToken();
        authToken.setToken(System.getProperty("token"));
        ticket = given()
                .header("Authorization", "token " + authToken.getToken())
                .pathParam("id", ticket.getId())
                .queryParam("status", Status.OPEN)
                .when().patch("/api/tickets/{id}")
                .then().statusCode(200)
                .extract().as(Ticket.class);

    }
}
