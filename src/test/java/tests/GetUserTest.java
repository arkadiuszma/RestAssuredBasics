import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetRequestTest extends BaseTest {
    @Test
    public void shouldReturnAllUsers() {
        when().
                get(baseUrl + "users").
        then().
                statusCode(200);
    }
    @Test
    public void shouldGetFirstUser() {
        given()
                .pathParams("id", "1").
        when().
                get(baseUrl + "users/{id}").
        then().
                statusCode(200);
    }
    @Test
    public void shouldGetUserByName() {
        given()
                .queryParams("name", "Bret").
        when().
                get(baseUrl + "users").
        then().
                statusCode(200);
    }
}
