//import jdk.jfr.TransitionTo;
import Base.Specifications;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class POST_CreateUser {


    private final static String URL = "https://stage.gate1.campuz.org/";

    @Test
    public void UserCreateBy() {

        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
//Формирование json звпроса

        JSONObject linkVK = new JSONObject();
        linkVK.put("linkView", "https://vk.com/id");
        linkVK.put("type", "instagram");
        //System.out.println(linkVK.get("linkView").toString());

        JSONObject linkOK = new JSONObject();
        linkOK.put("linkView", "https://OK.com/id");
        linkOK.put("type", "odnoklassniki");

        JSONArray socialLinks = new JSONArray();
        socialLinks.add(linkVK);
        socialLinks.add(linkOK);

        JSONObject userOb = new JSONObject();
        userOb.put("name", "Auto3");
        userOb.put("status", 1);
        userOb.put("password", 123);
        userOb.put("socialLinks", socialLinks);

        JSONObject user = new JSONObject();
        user.put("user", userOb);

        System.out.println(user);

  // POST запрос

        Response response = given()
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .body(user)
                .when()
                .post("/api/v1/auth")
                .then().log().all()
                .extract().response();

// Получение данных из ответа

        JsonPath jsonPath = response.jsonPath();

        int userid = jsonPath.get("user.id");
        System.out.println(userid);

        String tokenValue = jsonPath.get("authorization.access_token.value");
        System.out.println(tokenValue);

//Для работы с массивами
       /* int roles = jsonPath.get("roles[1]");
        System.out.println(roles);

        List<Integer> roles2 = jsonPath.get("roles");
        System.out.println(roles2.get(1));

        for (int i = 0; i < roles2.size(); i++) {
            System.out.println(roles2.get(i));*
        }*/

    }
}







