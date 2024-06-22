package ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Post_createNewUser {

    @Test
    public void createNewUserTest() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/";
//        String request_jsonBody = "{\n" +
//                "  \"id\": 12,\n" +
//                "  \"userName\": \"User 12\",\n" +
//                "  \"password\": \"Password12\"\n" +
//                "}";
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("id", 12);
        requestBody.put("userName", "User12");
        requestBody.put("password", "Password12");

        Response response = given().contentType(ContentType.JSON).body(requestBody).when().post("api/v1/Users");
        System.out.println(response.getStatusCode());

    }

}
