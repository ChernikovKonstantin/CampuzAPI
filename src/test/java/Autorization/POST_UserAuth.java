package Autorization;

import Base.Specifications;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class POST_UserAuth extends Specifications {
    private final static String URL = "https://stage.gate1.campuz.org/";

    @Test






































































































































    public void POST_UserAuthCode() {



        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());

        Map<Object, Object> outerMap = new HashMap<Object, Object>();
        Map<Object, Object> innerMap = new HashMap<Object, Object>();
        innerMap.put("authCode", "aaaaaa");
        outerMap.put("user", innerMap);

        System.out.println(outerMap);


//        Response response = given()
//                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
//                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
//                .body(outerMap)
//                .when()
//                .post("/api/v2/auth?mode=login")
//                .then().log().all()
//               // .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("JsonSchemaFile.json"))
//                .extract().response();
//                //.body(matchesJsonSchemaInClasspath("schema.json"));

        String api = "/api/v2/auth?mode=login";
        Response response = requestPost(outerMap, api);
        Response response12312 = requestPost(innerMap, api);


        JsonPath jsonPath = response.jsonPath();

        String auto0 = jsonPath.get("authorization.access_token.value");
        System.out.println(auto0);

        int auto = jsonPath.get("roles[1]");
        System.out.println(auto);


        List<Integer> auto2 = jsonPath.get("roles");
        System.out.println(auto2.get(2));

        for (int i = 0; i < auto2.size(); i++) {
            System.out.println(auto2.get(i));
        }

        //.extract().body().jsonPath().getList("data",UserData.class);

        // String value =
        //String category = with(Object).get("store.book[0].category");
        // JsonPath jsonPath = response.jsonPath();
        //result1 = jsonPath("$").toJSONString();


        // String authorization = jsonPath.get("authorization");
        // String value = jsonPath.get("value");
        // Assert.assertEquals("authorization",authorization);
        // Assert.assertEquals("V5YiSTbA5BJ0yF54PFDE-ViInmxQgbd9lfsAaQw9eaoOzPBPzwNZKN-LrtyibeosB864dHBZfxEcDpAj4mgBSw", value);


       /* Response response = given()
                .contentType("application/json")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .body(outerMap)
                .when()
                .post("api/v2/auth?mode=login")
                .then().log().all()
                .extract().response();*/


    }



}

