<!-- ch09/team.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="bean" class="ch09.TeamBean"/>
<jsp:setProperty property="*" name="bean"/>
<h2>TeamBean</h2>
num : <%=bean.getNum()%><br>
name : <%=bean.getName()%><br>
city : <%=bean.getCity()%><br>
age : <%=bean.getAge()%><br>
team : <%=bean.getTeam()%><br>
