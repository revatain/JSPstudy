
<%@page contentType="text/html; charset=UTF-8"%>
<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		boolean result = true;
		String msg = "로그인 실패 하였습니다.";
		String url = "login.jsp";
		if(result) {
			msg = "로그인 되었습니다.";
			url = "loginOK.jsp";
			session.setAttribute("idKey", id);
		}
%>
<script>
alert("<%=msg%>");
location.href="<%=url%>";
</script>
