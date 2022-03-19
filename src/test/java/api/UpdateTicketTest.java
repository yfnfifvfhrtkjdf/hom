package api;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.annotations.Test;
import java.io.IOException;
import static net.serenitybdd.rest.SerenityRest.*;

public class UpdateTicketTest extends  BaseTest {
    @Test
    public void updateTicketTest() throws IOException {
        Ticket ticket = createTicket(buildNewTicket(Status.CLOSED, 1));
        updateTicketNegative(ticket);
    }

    private void updateTicketNegative(Ticket ticket) {
        AuthToken token= login();
        ticket.setStatus(Status.OPEN.getCode());
        given()
                .body(ticket)
                .header("Authorization", "token " + token.getToken())
                .pathParam("ticket_id", ticket.getId())
                .when().put("/api/tickets/{ticket_id}")
                .then().statusCode(422)
                .extract().as(Ticket.class);
    }
}
