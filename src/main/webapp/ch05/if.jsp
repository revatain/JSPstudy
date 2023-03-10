<!-- ch05/if.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
		request.setCharacterEncoding("UTF-8");
		//if.html에서 name, color 던짐
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String msg = "";
		if(color.equals("blue")){
		}else if (color.equals("red")){
		}else if (color.equals("orange")){
		}else {
			msg = "기타";
			color = "white";
		}
%>
<body bgcolor="<%=color %>">
</body>
<%=name %>님이 좋아하는 색상은 <%=color %>입니다.
