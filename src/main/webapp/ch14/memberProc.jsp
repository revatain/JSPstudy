<!-- memberProc.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch14.MemberMgr"/>
<jsp:useBean id="bean" class="ch14.MemberBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		// 가입을 하고 실패하면 가입 실패 알림 member.jsp
		// 가입 성공 후에 login.jsp로 응답 (session에 id값 저장)
		boolean result = mgr.insertMember(bean);
		String msg = "가입 실패";
		String url = "member.jsp";
		if(result) {
			msg = "가입 성공";
			url = "login.jsp";
			// 가입과 동시에 로그인 처리
			session.setAttribute("idKey", bean.getId());
		}
%>
<script>
	alert("<%=msg%>");
	location.hrf = "<%=url%>";
</script>



