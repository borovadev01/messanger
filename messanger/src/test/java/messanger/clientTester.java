package messanger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class clientTester {

	public static void main(String[] args) {
		//		Client cl = Client.create();
		//		WebResource webResource = cl.re resource("http://localhost:8081/SimpleRS/math/table/post");
		//		String entity = "5";
		//		String response = webResource.accept("text/plain").entity(entity, "application/x-www-form-urlencoded").post(String.class);
		//		System.out.println(response.toString());

		//		tamplateTest();
		ets1Test();
	}

	private static void ets1Test() {
		try {

			Client cl = Client.create();
			WebResource webResource = cl.resource("http://localhost:8080/messanger/webapi/table");
			String entity = "5";
			//			String response = webResource.accept("text/plain").entity(entity, "application/x-www-form-urlencoded").post(String.class);
			Builder builder1 = webResource.accept("text/plain");
			Builder builder2 = builder1.entity(entity, "application/x-www-form-urlencoded");
			String response = builder2.post(String.class);
			System.out.println(response.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void tamplateTest() {
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/messanger/webapi/messages");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			System.out.println("============getCtoFResponse============");
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
