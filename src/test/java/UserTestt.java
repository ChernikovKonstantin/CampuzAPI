import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.proxy;

//public class UserTestt {
  //  private final static String URL = "https://stage.gate1.campuz.org/"; //установка домена

    /**
     * 1. Получить список пользователей со второй страница на сайте https://https://stage.gate1.campuz.org//
     * 2. Убедиться что id пользователей содержатся в их avatar;
     * 3. Убедиться, что email пользователей имеет окончание reqres.in;


  //  @Test                                   /*получить список пользователей*/
  //  public void checkUserListAndIDTest(){   //класс тест
    //    Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecОК200());
     //   List<UserData> users = given() //создание списка users, given статичный метод RA
     //          .when()//когда
     //           .get("/api/v1/user/list")//указание метода
     //           .then().log().all()// затем вывод в лог всего
     //           .extract().body().jsonPath().getList("data",UserData.class);//извлечь ответ в pojo класс. Извлекается тело ответа в формате json в виде списка.
                                                                                // "data",UserData.class - путь и класс, в который будет извлечен ответ. data - поле json
                //ВАРИАНТ 1

             //   users.forEach(x ->Assert.assertTrue(x.getAvatar().contains(x.getId().toString()))); // перебор пользователей, получение аватара и проверка содержания в аватаре id юзера
                                                                                                // Х - локальная переменная, счетчик классов. Получить аватар, cодержащий id.
                                                                                            // toString - получить как строку , так как id integer
      //          Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));     // stream -перебор списка и вызов методов поочередности. Через stream вызываем
                                                                                    // метод allMatch (т.е. все совпадения)
                //ВАРИАНТ 2

             //   List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());          //stream позволяет напрямую использовать метод из класса
        //colleсt конечный метод, собрать все и поместить в список
      //           List<String> ids = users.stream().map(x->x.getId().toString()).collect(Collectors.toList());

                 //перебор списков аватары и айди в цикле
             //    for(int i=0; i< avatars.size(); i++){
              //       Assert.assertTrue(avatars.get(i).contains(ids.get(i))); // достаем элемент аватар из списка под номером i
                     // и проверяем ассертом содеражание contains в нем элемента из списка ids




         /*       @Test
    public void CheckRegister(){
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecОК200());
        Integer id = 4418;
        String token_type = "Bearer";
        String value = "J9YifSqbhDcRqQY0w6TxRoMY-N-z6mo625G2eMVk9l42xNyaF46llH2Dc3QjxBcKmgHqwY-FMTRt74O3X0mMrg";
         JsonObject data = new JsonObject();
         JsonObject user =new JsonObject();
         user.addProperty("authCode", "130281");
         data.add("user", user);

                     Response postResponse = RestAssured.given()
                .contentType("application/json")
                .header("Authorization", "Api-key Kdh6pqsHoujd8SAj")
                .header("X-Api-Fingerprint", "a19ab9a8441e1445")
                .body(data)
                .when()
                .post("api/v2/auth?mode=login");
                     String body = postResponse.asString();
                     JSONObject response = null;
                     try {
                         response = new JSONObject(body);
                     } catch (JSONException e) {
                         e.printStackTrace();
                     }
                     String a="";

                     JSONObject auth = null;
                     try {
                         auth = response.getJSONObject("authorization");
                     } catch (JSONException e) {
                         e.printStackTrace();
                     }
                     JSONObject token = auth.getJSONObject("access_token");
                     token.get("value");

             //   .extract().body().jsonPath().getList("data",UserData.class)
                     //Assert.assertNotNull(autorizationSuccesPOJO.getId());
//        Assert.assertEquals(id, autorizationSuccesPOJO.getId());
//        Assert.assertEquals(token_type, autorizationSuccesPOJO.getToken_type());
//        Assert.assertEquals(value, autorizationSuccesPOJO.getValue());

      }*/
