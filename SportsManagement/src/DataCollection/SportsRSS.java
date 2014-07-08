package DataCollection;

import java.util.ArrayList;
import Elements.UserPreferences;

public class SportsRSS extends ChannelService {
	private String URL;
	// private RssParser parser;

	static final String TITLE = "title";
	static final String DESCRIPTION = "description";
	static final String CHANNEL = "channel";
	static final String LANGUAGE = "language";
	static final String COPYRIGHT = "copyright";
	static final String LINK = "link";
	static final String AUTHOR = "author";
	static final String ITEM = "item";
	static final String PUB_DATE = "pubDate";
	static final String GUID = "guid";

	public SportsRSS(String URL) {
		super(URL);
		this.URL = URL;

	}

	public ArrayList<UserPreferences> readFeed() {
		if (URL.contains("daserste")) {
			return daserste();
		} else if (URL.contains("skysporthd1")) {
			return	skyHD();
		} else if(URL.contains("fussballindex"))
			return daserste();
		else
			return daserste();
	}
	

}