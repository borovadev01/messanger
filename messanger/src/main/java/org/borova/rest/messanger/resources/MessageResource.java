package org.borova.rest.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.borova.rest.messanger.model.Message;
import org.borova.rest.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		System.out.println(messageService.getAllMessages());
		return messageService.getAllMessages();
	}
}
