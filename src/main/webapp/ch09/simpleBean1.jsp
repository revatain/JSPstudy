<!-- ch09/simpleBean1.jsp -->
<%@page import="ch09.SimpleBean"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%
	SimpleBean bean=new SimpleBean();
	String msg=request.getParameter("msg");
	int cnt=Integer.parseInt(request.getParameter("cnt"));
	//넘겨받은 값들을 Bean에 저장 why->db연동을 위해서
	bean.setMsg(msg);
	bean.setCnt(cnt);
%>
msg:<%=bean.getMsg()%><hr>
cnt:<%=bean.getCnt()%><hr>