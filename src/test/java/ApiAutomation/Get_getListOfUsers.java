package ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static io.restassured.RestAssured.given;

public class Get_getListOfUsers {

    @Test
    public void getListOfUsersTest() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/";
        Response response = given().when().get("api/v1/Users");
        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());

    }
}
