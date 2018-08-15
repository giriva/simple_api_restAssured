/**
 * Creted By Author: giriprasadvasudevan
 * Date :             15/08/2018
 * Year :             2018
 * Day :              15
 * Time :             22:23
 * Package Name :     getRequest
 */

package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetData {

    /**
     * The below function is to get the ResponseCode from http://dummy.restapiexample.com/
     */

    @Test

    public void testResponseCode() {
        Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
        int code = resp.getStatusCode();
        System.out.println("Status code is " + code);
        Assert.assertEquals(code, 200);


    }

    /**
     * The below function is to get the ResponseBody, Response time and Response headerType
     */

    @Test
    public void testResponseBody() {
        Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
        String data = resp.getBody().asString();
        System.out.println("Response Body is " + data);
        System.out.println("Response time " + resp.getTime());
        System.out.println("Response headerType" + resp.contentType());
    }


}
