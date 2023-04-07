<jsp:useBean id="bean" class="ch09.TeamBean"/>
<jsp:useBean id="mgr" class="ch09.TeamMgr"/>
<%@page import="ch09.MyUtil"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%
	int num=MyUtil.parseInt(request, "num");
	mgr.deleteTeam(num);
	response.sendRedirect("teamList.jsp");
%>