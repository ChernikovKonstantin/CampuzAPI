import Base.Base;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PageUser extends Base {

    @Test
    public Response userCreate(JSONObject user, int statusCode) {

        String api = "/api/v1/auth";
        Response response = requestPost(user, api, statusCode);

        JsonPath jsonPath = response.jsonPath();

        int userid = jsonPath.get("user.id");
        System.out.println(userid);

        String tokenValue = jsonPath.get("authorization.access_token.value");
        System.out.println(tokenValue);

        return response;
    }

    @Test
    public Response UserCreateNotValidNameWithNumber() {

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

        Random random = new Random();
        String nameString = "Auto" + random.nextInt(9999);
        //String nameString = generateString();

        JSONObject userOb = new JSONObject();
        userOb.put("name", nameString);
        userOb.put("status", 1);
        userOb.put("password", 123);
        userOb.put("socialLinks", socialLinks);
        JSONObject user = new JSONObject();
        user.put("user", userOb);
        System.out.println(user);


        String api = "/api/v1/auth";

        Response response = requestPost(user, api, 200);

        JsonPath jsonPath = response.jsonPath();

        return response;
    }


    @Test
    public Response UserCreateNotValidNameUsed() {

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

        Random random = new Random();
        String nameString = "Auto" + random.nextInt(9999);
        //String nameString = generateString();

        JSONObject userOb = new JSONObject();
        userOb.put("name", nameString);
        userOb.put("status", 1);
        userOb.put("password", 123);
        userOb.put("socialLinks", socialLinks);
        JSONObject user = new JSONObject();
        user.put("user", userOb);
        System.out.println(user);


        String api = "/api/v1/auth";

        Response response = requestPost(user, api, 200);

        JsonPath jsonPath = response.jsonPath();
        return response;
    }
}
