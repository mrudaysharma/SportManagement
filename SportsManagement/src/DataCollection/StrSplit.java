package DataCollection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrSplit {
	private String titleText;

	public static String SPORT_NAME = "Not Defined";
	public static String SPORT_TYPE = "Not Defined";
	public static String SPORT_SPONSERER = "Not Defined";
	public static String SPORT_LOCATION = "Not Defined";
	public static String SPORT_DATE = "Not Defined";
	public static String SPORT_TIME = "Not Defined";
	public static String Team1 = "Not Defined";
	public static String Team2 = "Not Defined";

	private static final String E_NAME_REGX2 = "\\s*-\\s*";
	private static final String E_NAME_REGX1 = "[a-zA-Z\\s]*:\\s*";
	private static final String E_NAME_REGX3 = "[a-zA-Z]\\s*-\\s*";

	private static final String E_TYPE_REGX1 = ":\\s*[a-zA-Z\\s*]\\s*-\\s*";

	private static final String E_TEAM1_FIFA = ":\\s*[a-zA-Z]\\s*-\\s*";
	private static final String E_TEAM2_FIFA = "-\\s*[a-zA-Z]\\s*|\\s*";

	private Pattern pattern;
	private Matcher matcher;
	String URL;

	public StrSplit(String text, String URL) {
		this.titleText = text;
		this.URL = URL;
		getSPORT_NAME();

		// getSPORT_SPONSERER();
		if (!URL.contains("fussballindex") || !URL.contains("daserste")) {
			getSPORT_LOCATION();
			getSPORT_TYPE();
		}
		getSPORT_DATE();
		if (!URL.contains("daserste"))
			getSPORT_TIME();
		getTeam1();
		getTeam2();
	}

	public void getSPORT_TIME() {
		SPORT_TIME = titleText.substring(titleText.indexOf("ab") + 3,
				titleText.indexOf(" Uhr"));
		SPORT_TIME.trim();

	}

	/**
	 */
	public void getSPORT_NAME() {
		Matcher match = matchPattern(E_NAME_REGX1);

		System.out.println(matcher.matches());
		if (match.find()) {
			System.out.println("True");
			SPORT_NAME = titleText.substring(0, titleText.indexOf(":"));
			System.out.println("Sports Name :" + SPORT_NAME);
		} else if (titleText.matches(E_NAME_REGX3)) {
			SPORT_NAME = titleText.substring(0, titleText.indexOf(" - "));
			System.out.println("Sports Name :" + SPORT_NAME);
		}

	}

	/**
	 */
	public void getSPORT_TYPE() {
		Matcher match = matchPattern(E_TYPE_REGX1);
		if(!URL.contains("dasterste"))
		if (match.find())
			SPORT_TYPE = titleText.substring(titleText.indexOf(": ") + 2,
					titleText.indexOf(" -"));

		SPORT_TYPE.trim();
	}

	/**
	 */
	public void getSPORT_SPONSERER() {
		if (titleText.substring(titleText.indexOf("-"), titleText.indexOf(",")) != null) {
			SPORT_SPONSERER = titleText.substring(titleText.indexOf("-"),
					titleText.indexOf(","));
			SPORT_SPONSERER.trim();
		}

	}

	/**
	 */
	public void getSPORT_LOCATION() {
		if(!URL.contains("daserste"))
		SPORT_LOCATION = titleText.substring(titleText.indexOf(","),
				titleText.indexOf("|"));
		SPORT_LOCATION.trim();

	}

	/**
	 */
	public void getSPORT_DATE() {
		if (!URL.contains("daserste")) {
			SPORT_DATE = titleText.substring(titleText.indexOf("|") + 2,
					titleText.indexOf(" ab"));
		}

		SPORT_DATE = titleText.substring(titleText.indexOf("|") + 2,
				titleText.lastIndexOf("|"));

		SPORT_DATE.trim();

	}

	/**
	 */
	public void getTeam1() {
		// System.out.println(titleText.matches(E_NAME_REGX2));
		Matcher match = matchPattern(E_TEAM1_FIFA);
		if (match.find()) {
			Team1 = titleText.substring(titleText.indexOf(":") + 2,
					titleText.indexOf("-"));
			System.out.println("Team 1" + Team1);
		} else if (titleText.matches(E_NAME_REGX1)) {
			Team1 = titleText.substring(titleText.indexOf(" - ") + 2,
					titleText.lastIndexOf(" - "));
		}
	}

	/**
	 */
	public void getTeam2() {
		Matcher match = matchPattern(E_TEAM2_FIFA);
		if(URL.contains("daserste"))
		{
			Team2 = titleText.substring(titleText.indexOf(" - ") + 2,
					titleText.lastIndexOf("-"));
		}
		else {
			 if (match.find())
			Team2 = titleText.substring(titleText.lastIndexOf("- ") + 2,
					titleText.lastIndexOf(" | "));
		} 
			
	}

	private Matcher matchPattern(String eNameRegx1) {
		pattern = Pattern.compile(E_NAME_REGX1);
		matcher = pattern.matcher(titleText);

		return matcher;

	}

}
