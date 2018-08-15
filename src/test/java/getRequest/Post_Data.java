/**
 * Creted By Author: giriprasadvasudevan
 * Date :             15/08/2018
 * Year :             2018
 * Day :              15
 * Time :             23:01
 * Package Name :     getRequest
 */

package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Post_Data {

    @Test

    /**
     * The below function is to perform POST request
     */

    public void test() {

        RequestSpecification request = RestAssured.given();

        Response response = request.post("http://dummy.restapiexample.com/api/v1/create");

        int code = response.getStatusCode();
        Assert.assertEquals(code, 200);
        //Response code is verified
    }


}
