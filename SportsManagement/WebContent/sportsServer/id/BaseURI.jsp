<%@ page language="java" contentType="application/xml; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.net.URI"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.ws.rs.core.MediaType"%>
<%@ page import="javax.ws.rs.core.UriBuilder"%>

<%!
public static class BaseURI
{
	public static URI getBaseURI() {
	    return UriBuilder.fromUri("http://localhost:8080/SportsManagement").build();
	  }
}
%>
