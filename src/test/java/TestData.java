import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.util.Random;

public class TestData {
    public static JSONObject userRegistrationData(String name) {
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
        // String nameString = "Auto" + random.nextInt(9999);

        JSONObject userOb = new JSONObject();
        userOb.put("name", name);
        userOb.put("status", 1);
        userOb.put("password", 123);
        userOb.put("socialLinks", socialLinks);
        JSONObject user = new JSONObject();
        user.put("user", userOb);
        return user;
    }
}
