package ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Put_updateUserNameAndVerifyResponse {

    @Test
    public void updateUserNameAndVerifyResponseTest() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/";

        Map<String, Object> updateBody = new HashMap<>();
        updateBody.put("id", 6);
        updateBody.put("userName", "User_#12");
        updateBody.put("password", "Password6");

        Response response = given().contentType(ContentType.JSON).body(updateBody).when().put("api/v1/Users/6");
        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());

        assert response.getStatusCode() == 200;
    }

}
