package Elements;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TV_Sport_Event")

// JAX-RS supports an automatic mapping from JAXB annotated class to XML and
// JSON
// Isn't that cool?
public class SportsElements {
	private String UID;
	@XmlElement(name = "Event", type = UserPreferences.class)
	List<UserPreferences> userPrefList;

	public String getUID() {
		return UID;
	}
   @XmlAttribute
	public void setUID(String summary) {
		this.UID = summary;
	}

	public void setUserPreferenceList(List<UserPreferences> userPrefList) {
		this.userPrefList = userPrefList;
	}

}
