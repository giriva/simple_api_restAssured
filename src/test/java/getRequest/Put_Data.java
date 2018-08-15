/**
 * Creted By Author: giriprasadvasudevan
 * Date :             15/08/2018
 * Year :             2018
 * Day :              15
 * Time :             23:46
 * Package Name :     getRequest
 */

package getRequest;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Put_Data {

    @Test

    /**
     * The below function is to perform PUT Request
     */

    public void test() {
        RequestSpecification request = RestAssured.given();

        request.header("ContentType.TEXT", "html");

        JSONObject json = new JSONObject();
        json.put("name", "test");
        json.put("Salary", "1");
        json.put("Age", "18");

        request.body(json.toJSONString());

    }

}
