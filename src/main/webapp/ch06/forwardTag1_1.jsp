<!-- ch06/forwardTag1_1.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
%>

<jsp:forward page="forwardTag1_2.jsp"/>
