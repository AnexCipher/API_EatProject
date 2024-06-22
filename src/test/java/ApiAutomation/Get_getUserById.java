package ApiAutomation;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_getUserById {

    @Test
    public void gerUserByIdTest() {
        Response response = given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Users/4");
        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());

    }

}
