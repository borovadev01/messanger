package org.borova.rest.messanger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageResource {

	@GET
	public String getMessages() {
		return "Hello world!";
	}
}
