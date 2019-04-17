package co.thebeat.ExerciseS;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


public class UserDataDummyTest {

    private String authToken = "QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==";

    @Test
    public void testUSerData() {

        given()
                .header("Authorization","Basic " + authToken)
                .contentType(ContentType.JSON)
                .pathParam("user_id", "1524")

        .when()
                .get("https://gorest.co.in/public-api/users/{user_id}")

        .then()
                .body("result.gender", equalTo("male"));

    }
}
