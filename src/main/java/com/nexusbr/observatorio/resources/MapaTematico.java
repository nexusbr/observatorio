package com.nexusbr.observatorio.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mapa")
public class MapaTematico {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages() {
		return "Mostra mapa NEXUS!";
	}
	
}
