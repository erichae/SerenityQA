package ReqresinApi.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Assert;

public class reqresStepdefs {
    reqres reqres = new reqres();

    @When("I send GET to Get Single User")
    public void iSendGETToGetSingleUser() {
        reqres.getsingleuser();
    }

    @Then("The response should be {int}")
    public void theResponseShouldBe(int expectedData) {
        Assert.assertEquals(expectedData, reqres.response.getStatusCode());
    }

    @And("The response Body {string} should be {int}")
    public void theResponseBodyShouldBe(String id, int expected) {
        int actual = reqres.response.jsonPath().get(id);
        Assert.assertEquals(expected, actual);
    }

    @And("the response Body {string} should be {string}")
    public void theResponseBodyShouldBe(String email, String expected) {
        String actual = reqres.response.jsonPath().get(email);
        Assert.assertEquals(expected, actual);
    }

    @And("The response Body JSONSchema is {string}")
    public void theResponseBodyJSONSchemaIs(String file) {
        String path = "schema/"+file;
        reqres.response.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(path));
    }
}
