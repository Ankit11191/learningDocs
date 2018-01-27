package webservice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetService {
	String url1 = "http://restapi.demoqa.com/utilities/weather/city/Gwalior";
	String url = "http://services.groupkt.com/country/get/all";

	private Response createAPI() {
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get(url);
		return response;
	}
	
	public static String respons() {
		GetService services = new GetService();
		Response res = services.createAPI();
		return res.getBody().asString();
	}
}
