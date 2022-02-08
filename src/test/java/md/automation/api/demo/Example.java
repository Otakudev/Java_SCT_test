package md.automation.api.demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Example {


    @Test
    void test01() {


        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
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