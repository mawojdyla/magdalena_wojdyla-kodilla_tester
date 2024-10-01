package com.kodilla.rest.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().
                header("Content-Type", "application/json").     // oczekuję odpowiedzi w formacie JSON
        when().
                get("https://jsonplaceholder.typicode.com/posts/1").
        then().
                assertThat().
                    statusCode(200).
                    body("userId", equalTo(1)).
                    body("id", equalTo(1)).
                    body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                    body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                    log().all();        //  sprawia, że wszystkie szczegóły odpowiedzi są logowane, co pozwala na wgląd w to, co faktycznie serwer zwrócił.
    }

    @Test
    void testShouldUpdatePost() {
        given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"id\": 1,\n" +
                        "    \"title\": \"foo\",\n" +
                        "    \"body\": \"bar\",\n" +
                        "    \"userId\": 1\n" +
                        "}")
        .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
        .then()
                .assertThat()
                .statusCode(200)
                .body("id", Matchers.equalTo(1))
                .body("title", Matchers.equalTo("foo"))
                .body("body", Matchers.equalTo("bar"))
                .body("userId", Matchers.equalTo(1));
    }
}
