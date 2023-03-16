<!-- ch12/cookCookie.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
		String cookieName = "myCookie";
		Cookie cookie = new Cookie(cookieName, "Apple");
		cookie.setMaxAge(60);
		cookie.setValue("Melone");
		response.addCookie(cookie);
%>
쿠키를 만들었습니다.<br>
쿠키 내용은 <a href="taseteCookie.jsp">여기로!!</a>