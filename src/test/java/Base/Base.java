package Base;

import io.restassured.response.Response;
import net.minidev.json.JSONObject;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class Base {

    public Response requestPost(JSONObject json, String api, int statusCode) {
        Response response = given()
                .baseUri("https://stage.gate1.campuz.org/")
                .contentType("application/json")
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .body(json)
                .when()
                .post(api)
                .then().log().all()
                .statusCode(statusCode)
                .extract().response();
                 return response;

    }


    public Response requestGet(JSONObject json, String api) {
        Response response = given()
                .baseUri("https://stage.gate1.campuz.org/")
                .contentType("application/json")
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .body(json)
                .when()
                .get(api)
                .then().log().all()
                .statusCode(200)
                .extract().response();
        return response;

    }
        public  String generateString() { // Генерация рандомного логина
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

}

