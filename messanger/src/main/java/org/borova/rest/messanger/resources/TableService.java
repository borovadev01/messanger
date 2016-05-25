package org.borova.rest.messanger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

class MathTable {
	public MathTable(Integer i) {

	}
}

@Path("table")
public class TableService {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String addp(String num) {
		MathTable mt = new MathTable(new Integer(num));
		return mt.toString();
	}
}