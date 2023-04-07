<!-- ch06/page3.jsp -->
<!-- charset:client에게 보낼 코드의 인코딩 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page pageEncoding="EUC-KR" 
		trimDirectiveWhitespaces="true"
%>
<%
		String site="jspstudy.co.kr";
		request.setAttribute("site", site);
%>
사이트명:<%=site%><br>
사이트명:${site}