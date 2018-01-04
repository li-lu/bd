package ws;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ws.bean.Audit;
import ws.dao.AuditDao;

@Path("/")
public class AuditService {
	@GET
	@Produces("text/html")
	public Response getStartingPage() {
		String output = "<h1>Hello Data Scientist!<h1>" + "<p>RESTful Service is running ... <br>Ping @ "
				+ new Date().toString() + "</p<br>";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/list/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Audit> getAudit_json() {
		return AuditDao.getAllAudits();
	}
	
	@GET
	@Path("/list/xml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Audit> getAudit_xml() {
		return AuditDao.getAllAudits();
	}

}
