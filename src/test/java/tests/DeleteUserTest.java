import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequestTest extends BaseTest{
    @Test
    public void shouldDeleteFirstUser() {
        given()
                .pathParams("id", "1").
        when().
                delete(baseUrl + "users/{id}").
        then().
                statusCode(200);
    }
}
