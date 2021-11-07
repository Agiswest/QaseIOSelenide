package adapters;

import static io.restassured.RestAssured.given;

public class BaseAdapter {
    String BASE_URL = "https://api.qase.io/";

    public void post(String body, String uri) {
        given().
                header("Content-Type", "application/json").
                header("Token", "e88e2085d8d7c3b3594d8e3c82d77989157aa7c3").
                body(body).
        when().
                post(BASE_URL + uri).
        then().
                log().all().
                statusCode(200);
    }

    public void delete(String uri) {
        given().
                header("Content-Type", "application/json").
                header("Token", "e88e2085d8d7c3b3594d8e3c82d77989157aa7c3").
        when().
                delete(BASE_URL + uri).
        then().
                log().all().
                statusCode(200);
    }

    public String get(String uri) {
        return given().
                header("Content-Type", "application/json").
                header("Token", "e88e2085d8d7c3b3594d8e3c82d77989157aa7c3").
        when().
                get(BASE_URL + uri).
        then().
                log().all().
                statusCode(200)
                .extract().body().asString();
    }
}
