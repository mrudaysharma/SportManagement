package CURD;

import java.util.UUID;

import DataCollection.SportsRSS;
import Interface.SportsManagementInterface;

public class SportsDataCollection implements SportsManagementInterface {

	SportsRSS parser;

	String sportName;

	/*
	 * // private String URL = "http://www.tvdigital.de/rss/sender/daserste/";
	 * private String URL =
	 * "http://localhost:8080/SportsManagement/daserste.xml"; //private Strubg
	 * URL = "http://www.tvdigital.de/rss/sender/skysporthd1/";
	 */

	public SportsDataCollection() {

	}

	@Override
	public String getUUID() {
		UUID userID = UUID.randomUUID();
		return userID.toString();
	}

}
