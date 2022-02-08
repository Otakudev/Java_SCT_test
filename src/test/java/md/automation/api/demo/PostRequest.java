package md.automation.api.demo;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class PostRequest {

    @Test
    public void test1_post() {

        JSONObject request = new JSONObject();

        request.put("name", "Ajeet");
        request.put("Job", "Teacher");


        given().
                header("Content-type","application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().post("https://jsonplaceholder.typicode.com/posts").
                then().statusCode(201).log().all();




    }

}