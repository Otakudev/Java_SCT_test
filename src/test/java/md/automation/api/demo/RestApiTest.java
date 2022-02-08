package md.automation.api.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class RestApiTest {
    @Test
    void test01 () {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
                System.out.println(response.asString());

    }
}
