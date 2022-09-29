package Base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Specifications {

    public static RequestSpecification requestSpec(String url){
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType("application/json")
                .build();
    }























    public static ResponseSpecification responseSpecOK200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
    public static ResponseSpecification responseSpecError400(){
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }
    public static ResponseSpecification responseSpec(int status){
        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .build();
    }
    public static void installSpecification(RequestSpecification requestSpec, ResponseSpecification responseSpec){
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }

    public static void installSpecification(RequestSpecification requestSpec){
        RestAssured.requestSpecification =requestSpec;
    }
    public static void installSpecification(ResponseSpecification responseSpec){
        RestAssured.responseSpecification =responseSpec;
    }

    public Response requestPost(Map<Object, Object> map, String api){
        Response response = given()
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .body(map)
                .when()
                .post(api)
                .then().log().all()
                // .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("JsonSchemaFile.json"))
                .extract().response();

        return response;
    }


}