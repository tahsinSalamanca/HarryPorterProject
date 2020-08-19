package APIPackage;

import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.BeforeClass;
import utilities.ConfigurationReader;

import java.util.Arrays;
import java.util.List;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class test1 {
String key="key";
String qkey="$2a$10$u4.U/L35M5SSDRxAzGnByu1HvtxR0LyeOruKktfl2A.0RPDv8geD6";

    @BeforeClass
    public void setUp() {
       // baseURI = ConfigurationReader.get("harryptr.uri");
    }

    @Test
    public void sortingHat() {
        Response response = given().get("https://www.potterapi.com/v1/sortingHat");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.contentType(), "application/json; charset=utf-8");
        List<String> expected = Arrays.asList("\"Gryffindor\"", "\"Ravenclaw\"", "\"Slytherin\"", "\"Hufflepuff\"");
        System.out.println("expected = " + expected);

        Assert.assertTrue(expected.contains(response.body().asString()));
        //System.out.println(response.body().asString());

    }
}
