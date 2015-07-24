package techshop;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("customers")
public class CustomerResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String find(@QueryParam("id") String id) {
		return "<customers><customer><name>Gama</name><age>29</age></customer></customers>";
	}
	
}
