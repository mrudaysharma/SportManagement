package DataCollection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import Elements.SportsElements;
import Elements.UserPreferences;

import com.sun.cnpi.rss.elements.Item;
import com.sun.cnpi.rss.elements.Rss;
import com.sun.cnpi.rss.parser.RssParser;
import com.sun.cnpi.rss.parser.RssParserException;
import com.sun.cnpi.rss.parser.RssParserFactory;

public class ChannelService {

	RssParser parser;
	Rss rss;
	Collection<?> items;
	SportsElements feed;
	UserPreferences message;
	
	String URL;
	private StrSplit titleSplit;
	ArrayList<UserPreferences> sportList;

	public ChannelService() {

	}

	public ChannelService(String URL) {
		try {
			this.URL = URL;
			parser = RssParserFactory.createDefault();
			rss = parser.parse(new URL(URL));
			items = rss.getChannel().getItems();

			feed = new SportsElements();
			sportList = new ArrayList<UserPreferences>();

		} catch (RssParserException e) {
	
			e.printStackTrace();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	public ArrayList<UserPreferences> daserste() {

		if (items != null && !items.isEmpty()) {

			// FeedMessage message = new FeedMessage();

			// Iterate over our main elements. Should have one for each
			// article

			for (Iterator<?> i = items.iterator(); i.hasNext();) {
				// Iterator i = items.iterator();
				Item item = (Item) i.next();
				if (item.getTitle().toString().contains("Livestream")) {
					if (!item.getTitle().toString().contains("WM extra"))
						
						extractData(item);

				}
				if(item.getTitle().toString().contains("FIFA WM 2014:"))
				{
					if (!item.getTitle().toString().contains("WM extra"))
						extractData(item);
				}
			}
			
		}
      return sportList;
	}

	public ArrayList<UserPreferences> skyHD() {
		Iterator<?> i = items.iterator();
		i.next();
        return sportList;
	}

	private void extractData(Item item) {
		System.out.println("Title: " + item.getTitle());
		System.out.println("Link: " + item.getLink());
		System.out.println("Description: " + item.getDescription());
		titleSplit = new StrSplit(item.getTitle().getText(), URL);

		// feed = new Feed(StrSplit.SPORT_NAME, StrSplit.SPORT_TYPE,
		// StrSplit.Team1, StrSplit.Team2);
		
		message = new UserPreferences();
		message.setSportsName(StrSplit.SPORT_NAME);
		message.setSportsType(StrSplit.SPORT_TYPE);
		message.setTeam1(StrSplit.Team1);
		message.setTeam2(StrSplit.Team2);
		message.setSportDate(StrSplit.SPORT_DATE);
		message.setSportTime(StrSplit.SPORT_TIME);
		sportList.add(message);

	}

}
