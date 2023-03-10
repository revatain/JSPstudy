<!-- ch09/teamList.jsp -->
<%@page import="ch09.TeamBean"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch09.TeamMgr"/>
<%
		Vector<TeamBean> vlist = mgr.listTeam();
		out.println(vlist.size());
%>
<div align="center">
<h1>Team List</h1>
<table border="1">
<tr>
			<th>번호</th>
			<th>이름</th>
			<th>사는곳</th>
			<th>나이</th>
			<th>팀명</th>
	</tr>
	<% 
			for(int i = 0; i<vlist.size(); i++) {
				TeamBean bean = vlist.get(i);
				%>
				<tr>
				<td><%=bean.getNum()%></td>
				<td><%=bean.getName()%></td>
				<td><%=bean.getCity()%></td>
				<td><%=bean.getAge()%></td>
				<td><%=bean.getTeam()%></td>
			
			</tr>
	<% 
			}
	%>
</table>
</div>