<%@ page language="java" contentType="application/xml; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.net.URI"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.ws.rs.core.MediaType"%>
<%@ page import="javax.ws.rs.core.UriBuilder"%>

<%@ page import="com.sun.jersey.api.client.Client"%>
<%@ page import="com.sun.jersey.api.client.WebResource"%>
<%@ page import="com.sun.jersey.api.client.config.ClientConfig"%>
<%@ page import="com.sun.jersey.api.client.config.DefaultClientConfig"%>
<%@include file="BaseURI.jsp" %>
<%
String sportText;
ClientConfig configure = new DefaultClientConfig();
Client client = Client.create(configure);
WebResource service = client.resource(BaseURI.getBaseURI());

// Get XML
out.print(service.path("rest").path("todo").accept(MediaType.APPLICATION_XML).get(String.class));

 


%>