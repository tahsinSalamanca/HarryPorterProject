package step_defs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.List;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class SortingHats {
    Response response;

    @Given("set URI")
    public void set_URI() {
        baseURI = ConfigurationReader.get("harryptr.uri");
    }

    @When("the user send get request")
    public void the_user_send_get_request() {
         response = given().get("/v1/sortingHat");
    }

    @Then("Verify the statusCode is {int}")
    public void verify_the_statusCode_is(Integer int1) {
        assertThat(response.statusCode(),is(200));

    }

    @Then("Verify the Content Type is is {string}")
    public void verify_the_Content_Type_is_is(String conType) {
     assertThat(response.contentType(),is(conType));
    }

    @Then("Rensponse body contains  one of")
    public void rensponse_body_contains_one_of(List<String> listHouse) {
     assertTrue(listHouse.contains(response.asString()));
    }
}
