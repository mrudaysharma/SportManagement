package CURD;

import java.awt.Window;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import DataCollection.SportsRSS;
import Elements.SportsElements;
import Elements.UserPreferences;

@Path("/todo")
public class SportsManagement extends SportsDataCollection {
	 private String URL = "http://www.tvdigital.de/rss/sender/daserste/";
	//private String URL = "http://localhost:8080/SportsManagement/daserste.xml";
     // private String URL = "http://www.sportschau.de/fussball/fussballindex100_type-rss.feed";
	// private Strubg URL = "http://www.tvdigital.de/rss/sender/skysporthd1/";
	// This method is called if XMLis request
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	public SportsElements getXML() {
		SportsRSS parser = new SportsRSS(URL);
		SportsElements todo = new SportsElements();
		List<UserPreferences> list = parser.daserste();

		todo.setUID(getUUID());

		try {
			todo.setUserPreferenceList(list);

			JAXBContext jaxb = JAXBContext.newInstance(SportsElements.class);

			Marshaller marshaller = jaxb.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			/* -- output to console */
			marshaller.marshal(todo, System.out);

		} catch (JAXBException ex) {
			Logger.getLogger(Window.class.getName())
					.log(Level.SEVERE, null, ex);
		}

		return todo;
	}

}