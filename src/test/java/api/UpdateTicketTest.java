package api;

import model.Status;
import model.Ticket;
import org.testng.annotations.Test;

import static net.serenitybdd.rest.SerenityRest.given;

/** Обновление тикета */
public class UpdateTicketTest extends BaseTest {

    @Test
    public void updateTicketTest() {
       // createTicket(buildNewTicket(Status.CLOSED, 1));
        updateTicketNegative(createTicket(buildNewTicket(Status.CLOSED, 1)));
        // todo: создать тикет со статусом Closed, затем обновить тикет
        //  и проверить сообщение об ошибке (негативный сценарий)
    }

    private void updateTicketNegative(Ticket ticket) {
        ticket = given()
             //   .pathParam("tickId", id)
                .body(ticket)
                .when().post("/api/tickets/{id}")
                .then().statusCode(400)
                .extract().as(Ticket.class);

        // todo: отправить HTTP запрос для обновления данных тикета
        //  и сразу же проверить статус код (должен соответствовать ошибке)


    }
}
