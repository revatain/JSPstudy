<!-- ch07/forwardTag2_1.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
		String bloodType = request.getParameter("bloodType");
		String name = "홍길동";
%>
<jsp:forward page='<%=bloodType+".jsp"%>'>
<jsp:param name="name" value="<%=name%>" />
</jsp:forward>
