<!-- mailSendProc.jsp -->
<%@page import="mail.MemberMgr"%>
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="mail.MailSend"/>
<%
		// 전송 성공 및 실패 -> mailSend.jsp 응답
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		boolean result = mgr.sendPwd(id, email);
		String msg = "전송 실패";
		if(result) msg = "전송 성공";
%>
<script>
	alert("<%=msg%>");
	location.href = "mailSend.jsp";
</script>