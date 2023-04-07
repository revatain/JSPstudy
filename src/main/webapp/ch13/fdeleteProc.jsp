<jsp:useBean id="mgr" class="ch13.FileloadMgr"/>
<%@page contentType="text/html; charset=UTF-8"%>
<%
	String snum[]=request.getParameterValues("fch");
	//0,1,3,5
	int num[]=new int[snum.length-1];
	for(int i=0; i<num.length; i++){
		num[i]=Integer.parseInt(snum[i+1]);
	}
	mgr.deleteFile(num);
	response.sendRedirect("flist.jsp");
%>