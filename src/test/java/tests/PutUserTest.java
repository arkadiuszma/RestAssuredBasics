import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutRequestTest extends BaseTest{
    @Test
    public void shouldOverrideUser() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                                {
                                    "id": 1,
                                    "name": "Leanne Graham",
                                    "username": "Bret",
                                    "email": "Sincere@april.biz",
                                    "address": {
                                      "street": "Kulas Light",
                                      "suite": "Apt. 556",
                                      "city": "Gwenborough",
                                      "zipcode": "92998-3874",
                                      "geo": {
                                        "lat": "-37.3159",
                                        "lng": "81.1496"
                                      }
                                    },
                                    "phone": "1-770-736-8031 x56442",
                                    "website": "hildegard.org",
                                    "company": {
                                      "name": "Romaguera-Crona",
                                      "catchPhrase": "Multi-layered client-server neural-net",
                                      "bs": "harness real-time e-markets"
                                    }
                                  }""").
        when()
                .put(baseUrl + "users/1").
        then()
                .statusCode(200);

    }
}
