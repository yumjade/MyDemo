<%@ page contentType="text/html;charset=gbk"%>
<link href="css/generalstyle.css" type="text/css" rel="stylesheet"><br>

<table align=center border="0" width="80%" height=20 >
  <tr align="center">
    <td height=15 colspan="5">
	  <font color="#5e82e9" size="6">���վƵ�Ԥ������</font>
	</td>
  </tr>
  <tr>
   <td align="right" colspan="5">
  	<%String adname = (String)session.getAttribute("adname");
  	  if(adname!=null){
  	   out.println("����Ա"+adname+"����");
  	   }%>
    </td>
  </tr>
</table>
<table align="center" border="0" width="80%" bgcolor="#92cfeb">
  <tr>
   <td><a href="adindex.jsp">��¼</a></td>
   <td><a href=RegAndLoginServlet?action=adlogout>ע��</a></td>
   <td><a href=adminChangePwd.jsp>�޸�����</a></td>
   <td><a href=ListServlet?action=admanage>����Ա����</a></td>
   <td><a href=ListServlet?action=adminGroup>�������</a></td>
   <td><a href=ListServlet?action=adminList&&gId=0>��Դ����</a></td>
   <td><a href=OrderServlet?action=allOrders&&condition=1>��������</a></td>
  </tr>
</table>