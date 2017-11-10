package cl.falabella.svl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@Path("/PruebaService")
public class PruebaService {
	PruebaDAO dao = new PruebaDAO();
	@GET
	@XmlPath("/Prueba")
	@Produces(MediaType.APPLICATION_JSON)
	public String prueba() {
		return dao.obtenerUsuarios();
	}
}
