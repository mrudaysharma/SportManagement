<%@ page contentType="application/json; charset=iso-8859-1" language="java" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.net.*"%>
<%@ page import="java.util.*"%>
<%
 String q =request.getParameter("q");
 String str="This is JSP string loading from JSP page in ajax, loading time :"; 
 java.util.Date dt=new java.util.Date();
 
 response.setContentType("application/json");
 String json = "{\"data\":[{\"message\":\"skyfall\",\"type\":\"status\"},{\"message\":\"LEGO\",\"type\":\"status\"},{\"message\":\"Das Boot\",\"type\":\"status\"},{\"message\":\"Nosferatu\",\"type\":\"status\"},{\"message\":\"Funny Games\",\"type\":\"status\"},{\"message\":\"\",\"type\":\"status\"}],\"from\":{\"id\":\"588438281236183\",\"category\":\"Community\",\"name\":\"Followrtl\"}}";
 
 response.getWriter().print(json);
 //out.print(json);
%>