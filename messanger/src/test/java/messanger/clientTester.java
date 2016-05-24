package messanger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class clientTester {

	public static void main(String[] args) {
		//		Client cl = Client.create();
		//		WebResource webResource = cl.re resource("http://localhost:8081/SimpleRS/math/table/post");
		//		String entity = "5";
		//		String response = webResource.accept("text/plain").entity(entity, "application/x-www-form-urlencoded").post(String.class);
		//		System.out.println(response.toString());

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

			//			Client cl = Client.create();
			//			WebResource webResource = cl.resource("http://localhost:8081/SimpleRS/math/table/post");
			//			String entity = "5";
			//			String response = webResource.accept("application/json").entity(entity, "application/x-www-form-urlencoded").post(String.class);
			//			System.out.println(response.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
