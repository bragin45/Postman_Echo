package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void shouldPostmanEcho () {
        given()
                .baseUri("https://postman-echo.com")
                .body("test postman_echo")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("test postman_echo wrong"))
                ;
    }

}
