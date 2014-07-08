<%@ page contentType="application/json; charset=iso-8859-1"
	language="java"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.net.*"%>
<%@ page import="java.util.*"%>
<%
	String q = request.getParameter("q");
	String str = "This is JSP string loading from JSP page in ajax, loading time :";
	String json;
	java.util.Date dt = new java.util.Date();

	response.setContentType("application/json");
	if (q.equals("LEGO")) {
		json = "{\"Released\":\"09 Nov 2012\",\"Youtube trailer\":\"6kw1UVovByw\",\"Type\":\"movie\",\"Runtime\":\"143 min\",\"Response\":\"True\",\"Poster\":\"http://ia.media-imdb.com/images/M/MV5BMjAyODkzNDgzMF5BMl5BanBnXkFtZTcwMDMxMDI4Nw@@._V1_SX300.jpg\",\"Title\":\"LEGO\",\"imdbRating\":\"7.8\",\"Actors\":\"LEGO Actor, Judi Dench, Javier Bardem, Ralph Fiennes\",\"Writer\":\"Neal Purvis, Robert Wade, John Logan\",\"Genre\":\"Action, Adventure, Thriller\",\"Producer\":\"Barbara Broccoli\",\"Awards\":\"Won 2 Oscars. Another 40 wins & 74 nominations.\",\"Director\":\"Sam Mendes\"}";
	} else if (q.equals("skyfall")) {
		json = "{\"Released\":\"09 Nov 2012\",\"Youtube trailer\":\"6kw1UVovByw\",\"Type\":\"movie\",\"Runtime\":\"143 min\",\"Response\":\"True\",\"Poster\":\"http://ia.media-imdb.com/images/M/MV5BMjAyODkzNDgzMF5BMl5BanBnXkFtZTcwMDMxMDI4Nw@@._V1_SX300.jpg\",\"Title\":\"Skyfall\",\"imdbRating\":\"7.8\",\"Actors\":\"Daniel Craig, Judi Dench, Javier Bardem, Ralph Fiennes\",\"Writer\":\"Neal Purvis, Robert Wade, John Logan\",\"Genre\":\"Action, Adventure, Thriller\",\"Producer\":\"Barbara Broccoli\",\"Awards\":\"Won 2 Oscars. Another 40 wins & 74 nominations.\",\"Director\":\"Sam Mendes\"}";
	} else {
		json = "{\"Released\":\"09 Nov 2012\",\"Youtube trailer\":\"6kw1UVovByw\",\"Type\":\"movie\",\"Runtime\":\"143 min\",\"Response\":\"True\",\"Poster\":\"http://ia.media-imdb.com/images/M/MV5BMjAyODkzNDgzMF5BMl5BanBnXkFtZTcwMDMxMDI4Nw@@._V1_SX300.jpg\",\"Title\":\"Skyfall\",\"imdbRating\":\"7.8\",\"Actors\":\"Daniel Craig, Judi Dench, Javier Bardem, Ralph Fiennes\",\"Writer\":\"Neal Purvis, Robert Wade, John Logan\",\"Genre\":\"Action, Adventure, Thriller\",\"Producer\":\"Barbara Broccoli\",\"Awards\":\"Won 2 Oscars. Another 40 wins & 74 nominations.\",\"Director\":\"Sam Mendes\"}";
	}

	response.getWriter().print(json);
	//out.print(json);
%>