package tests;

import configuration.BaseTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.restassured.RestAssured.given;

public class PatchPostTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"1"})
    public void shouldUpdatePostById(String id) {
        given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                              "title": "Example title",
                              "body": "Example body"
                              }
                              """).
        when()
                .patch(POSTS + "/" + id).
        then()
                .statusCode(200);

    }
}
