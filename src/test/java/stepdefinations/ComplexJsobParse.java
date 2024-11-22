package stepdefinations;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.JsonToJava;
import pojo.Payload;

public class ComplexJsobParse {

    public static void main(String[] args) {
        /*JsonPath jp  = new JsonPath(Payload.CoursePrice());
        System.out.println(jp.getInt("courses.size()"));
        //System.out.println(jp.getString("courses.title[1]"));
        System.out.println(jp.getInt("dashboard.purchaseAmount"));

        for(int i = 0; i<3; i++){
            if(jp.getString("courses["+i+"].title").equals("Cypress")){
                System.out.print(jp.getString("courses["+i+"].title"));
                System.out.println(jp.get("courses["+i+"].price").toString());
            }

        }*/
       String data = Payload.responseData();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonToJava user = objectMapper.readValue(data, JsonToJava.class);
            System.out.println(user);
        } catch (Exception e) {
           e.printStackTrace();
        }
     //   System.out.println(user.g);

    }
}
