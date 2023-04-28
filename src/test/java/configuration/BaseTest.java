import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static final String baseUrl = "https://jsonplaceholder.typicode.com/";

    @BeforeAll
    public static void setup(){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
