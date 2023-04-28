package tests;

import io.restassured.http.ContentType;
import models.users.PostJsonHandler;
import configuration.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.restassured.RestAssured.given;

public class PutPostTest extends BaseTest {
    @ParameterizedTest
    @CsvSource("1")
    public void shouldOverrideUser(String id) {
        given()
                .contentType(ContentType.JSON)
                .body(new PostJsonHandler().getPostFromFile()).
        when()
                .put(POSTS + "/" + id).
        then()
                .statusCode(200);
    }
}
