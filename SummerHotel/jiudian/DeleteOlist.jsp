<%@ page
 contentType="text/html;charset=gbk"
 import="java.io.*,javax.servlet.*,wyf.wyy.MyConverter,wyf.wyy.DB,java.util.*,wyf.wyy.DB_delete"
 %>
 <%
 String param=request.getParameter("param1").trim();
 String oid=MyConverter.unescape(param);
 System.out.print(oid);
 if(DB_delete.isDelete(oid))
 {
   out.println(MyConverter.escape("����ɾ���ɹ���"));
 }
 else
 {
   out.println(MyConverter.escape("����ɾ��ʧ�ܣ�"));
 }
 %>