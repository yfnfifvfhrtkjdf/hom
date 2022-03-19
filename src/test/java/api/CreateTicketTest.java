package api;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.Assert;
import org.testng.annotations.Test;
import static net.serenitybdd.rest.SerenityRest.given;

/** Создание и проверка тикета */
public class CreateTicketTest extends BaseTest {
    @Test
    public void createTicketTest() {
        Ticket ticket = createTicket(buildNewTicket(Status.OPEN, 1));
        getTicket(ticket.getId());
        Assert.assertEquals(ticket.getId(), getTicket(ticket.getId()), "не равны");
    }

    protected int getTicket(int id) {
        AuthToken token= login();
                 given()
                .header("Authorization", "token " + token.getToken())
                .pathParam("id", id)
                .when()
                .get("/api/tickets/{id}")
                .then().statusCode(200)
                .extract().as(Ticket.class);
        return id;
    }
}















































































































































































































































































































































































































































































































