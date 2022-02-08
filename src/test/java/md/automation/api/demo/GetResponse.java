package md.automation.api.demo;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class GetResponse {
    @Test
    void test01_get() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(response.getBody().asString());
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        // Validate status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    }
