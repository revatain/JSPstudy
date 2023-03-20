<!-- updateGuestBookProc.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr"  class ="guestbook.GuestBookMgr"/>
<jsp:useBean id="bean"  class ="guestbook.GuestBookBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		if(bean.getSecret()==null)
			bean.setSecret("0");
		mgr.updateGuestBook(bean);
%>
<script type="text/javascript">
	opener.location.reload();
	self.close();
</script>