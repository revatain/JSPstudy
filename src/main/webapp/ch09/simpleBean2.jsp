<!-- ch09/simpleBean2.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="bean" class="ch09.SimpleBean"/>
<!-- 모든 값을 받아오려할 때 * 기호를 쓴다. -->
<h3>SimpleBean2</h3>
<jsp:setProperty property="*" name="bean"/>
msg : <%=bean.getMsg()%><br>
cnt : <%=bean.getCnt()%><br>
msg : <jsp:setProperty property="msg" name="bean"/><br>
cnt : <jsp:setProperty property="cnt" name="bean"/><br>