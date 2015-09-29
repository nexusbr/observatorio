package com.nexusbr.observatorio.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mapa")
public class MapaTematico {
	
	@GET
	@Path("/texto")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages() {
		return "Mostra mapa NEXUS!";
	}
	
	@GET
	@Path("/geojson")
	@Produces(MediaType.TEXT_PLAIN ) //+ "; charset=utf-8"
	public String getMessagesJson() {
		return "Mostra mapa GeoJson";
	}


	
}
