<%@ page
 contentType="text/html;charset=gbk"
 import="java.io.*,javax.servlet.*,wyf.wyy.MyConverter,wyf.wyy.DB,java.util.*"
 %>
<%
   String param1=request.getParameter("param1").trim();
      //System.out.println(",�û������Ѿ����ؿͻ��ˣ�");
   String uname=MyConverter.unescape(param1);
   Vector<String> userInfo=new Vector<String>(); 
   userInfo=DB.getUserInfo(uname);
   StringBuffer msg=new StringBuffer();
   for(String s:userInfo)
   {
 	msg.append(s);
 	msg.append("|");
   }
   String s=msg.toString();
   out.println(MyConverter.escape(s));
   //System.out.println(s+",�û������Ѿ����ؿͻ��ˣ�");
%>