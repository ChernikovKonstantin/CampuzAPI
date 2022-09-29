import Base.Specifications;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;


import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class GET_UserInfo {

    private final static String URL = "https://stage.gate1.campuz.org/";


    @Test
    public void GET_User_info() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());

        Response response = given()
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .when()
                .get("/api/v2/user/info")
                .then().log().all()
                .body("result", equalTo("Ok"))
                .body("data.id", equalTo(4497))
                .body("data.id", notNullValue())
                //.body("data.relationships.identifiers", equalTo("<[[20002, 20247, 28087]]>"))
                .extract().response();



                JsonPath jsonPath = response.jsonPath();

                List<Integer> auto2 = jsonPath.get("data.roles");
                System.out.println(auto2);

                 List<String> auto3 = jsonPath.get("data.roles");
                 System.out.println(auto3);



                 // Assert.assertTrue(auto3.Arrays.stream().allMatch(x->x.contains("2"));
                //Assert.assertTrue(auto3.stream().allMatch("20002"););
                 //for (int i = 0; i < auto2.size(); i++) {
                   // Assert.assertTrue(x->x.contains());
                  //  System.out.println(auto2.get(i));
                // }

                int auto = jsonPath.get("data.roles[1]");
                System.out.println(auto);

                String auto4 = jsonPath.get("data.type");
                System.out.println(auto4);



    }

}
