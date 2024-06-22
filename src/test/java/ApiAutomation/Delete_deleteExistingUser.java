package ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Delete_deleteExistingUser {

    @Test
    public void deleteExistingUserTest() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/";
        Response response = given().when().delete("api/v1/Users/3");
        System.out.println(response.getStatusCode());

    }

}
