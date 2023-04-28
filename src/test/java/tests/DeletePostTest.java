package tests;

import configuration.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.restassured.RestAssured.given;

public class DeletePostTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"1"})
    public void shouldDeleteFirstUser(String id) {
        given()
                .pathParams("id", id).
        when().
                delete(POSTS + "/{id}").
        then().
                statusCode(200);
    }
}
