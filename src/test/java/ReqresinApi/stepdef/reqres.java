package ReqresinApi.stepdef;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class reqres {
    public static Response response;

    public void getsingleuser (){
        response = RestAssured.get("https://reqres.in/api/users/3");
    }
}
