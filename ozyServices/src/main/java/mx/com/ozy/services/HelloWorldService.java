package mx.com.ozy.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/plantilla")
public class HelloWorldService {

	@GET
	@Path("/{valor}")
	public Response sayHello(@PathParam("valor") String msg) {
		String output = "Hello, " + msg + "!";
		return Response.status(200).entity(output).build();
	}

}