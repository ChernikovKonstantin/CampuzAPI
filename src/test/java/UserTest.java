import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class UserTest extends PageUser {



    @Test //получение ошибки при повторном создании юзера с тем же логином
    public void userCreateSuccess()  {
        String nameString = generateString();
        JSONObject user = TestData.userRegistrationData(nameString);
        userCreate(user, 200);
    }

    @Test //получение ошибки при повторном создании юзера с тем же логином
    public void userCreateFalied()  {
        Random random = new Random();
        String nameString = "Auto" + random.nextInt(9999);
        JSONObject user = TestData.userRegistrationData(nameString);
        userCreate(user, 200);
    }
}





