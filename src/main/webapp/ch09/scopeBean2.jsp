<%@page contentType="text/html; charset=UTF-8"%>
<%
		session.removeAttribute("pBean");
		session.invalidate();
		response.sendRedirect("scopeBean.jsp");
%>
