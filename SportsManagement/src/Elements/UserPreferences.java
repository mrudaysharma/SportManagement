package Elements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Sport")
public class UserPreferences {

	String SportsName;
	String SportsType;
	String SportsSponser;
	String SportPlace;
	String SportDate;
	String SportTime;
	String Team1;
	String Team2;
	String Country;
	
	
	
	public String getTeam1() {
		return Team1;
	}

	@XmlElement
	public void setTeam1(String Team1) {
		this.Team1 = Team1;
	}

	public String getTeam2() {
		return Team2;
	}

	@XmlElement
	public void setTeam2(String Team2) {
		this.Team2 = Team2;
	}
	
	/**
	 * @return the sportsName
	 */
	
	public String getSportsName() {
		return SportsName;
	}

	/**
	 * @param sportsName the sportsName to set
	 */
	@XmlAttribute
	public void setSportsName(String sportsName) {
		SportsName = sportsName;
	}

	/**
	 * @return the sportsType
	 */
	public String getSportsType() {
		return SportsType;
	}

	/**
	 * @param sportsType the sportsType to set
	 */
	@XmlElement
	public void setSportsType(String sportsType) {
		SportsType = sportsType;
	}

	/**
	 * @return the sportsSponser
	 */
	public String getSportsSponser() {
		return SportsSponser;
	}

	/**
	 * @param sportsSponser the sportsSponser to set
	 */
	@XmlElement
	public void setSportsSponser(String sportsSponser) {
		SportsSponser = sportsSponser;
	}

	/**
	 * @return the sportPlace
	 */
	public String getSportPlace() {
		return SportPlace;
	}

	/**
	 * @param sportPlace the sportPlace to set
	 */
	@XmlElement
	public void setSportPlace(String sportPlace) {
		SportPlace = sportPlace;
	}

	/**
	 * @return the sportVanue
	 */
	
	public String getSportDate() {
		return SportDate;
	}

	/**
	 * @param sportVanue the sportVanue to set
	 */
	@XmlElement
	public void setSportDate(String sportDate) {
		SportDate = sportDate;
	}
	/**
	 * @return the sportTime
	 */
	
	public String getSportTime() {
		return SportTime;
	}

	/**
	 * @param sportTime the sportTime to set
	 */
	@XmlElement
	public void setSportTime(String sportTime) {
		SportTime = sportTime;
	}

	
}