<!-- ch05/gugudan.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<h1>십구단</h1>
<table border="1">
<tr>
			<th>1 단</th>		
			<th>2 단</th>		
			<th>3 단</th>		
			<th>4 단</th>		
			<th>5 단</th>		
			<th>6 단</th>		
			<th>7 단</th>		
			<th>8 단</th>		
			<th>9 단</th>		
			<th>10 단</th>		
			<th>11 단</th>		
			<th>12 단</th>		
			<th>13 단</th>		
			<th>14 단</th>		
			<th>15 단</th>		
			<th>16 단</th>		
			<th>17 단</th>		
			<th>18 단</th>		
			<th>19 단</th>		
	</tr>
	<%
	for (int i = 1; i <= 19; i++) {
	%>
	<tr>
		<%
		for (int j = 1; j <= 19; j++) {
		%>
		<td><%=i + "X" + j + "=" + (i * j)%></td>
		<%
		}
		%>
	</tr>
	<%
	}
	%>
</table>