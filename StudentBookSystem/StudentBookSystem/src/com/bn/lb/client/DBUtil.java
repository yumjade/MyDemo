package com.bn.lb.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class DBUtil 
{
    public static Connection getConnection()
	{
		Connection con=null;
		try
		{			
			Class.forName("org.gjt.mm.mysql.Driver");
			con=DriverManager.getConnection("jdbc:mysql://192.168.0.106:3306/test?useUnicode=true&characterEncoding=UTF-8","root","initial");  		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
    
    
    //֪��ѧ����ѧ�ŵõ���������
    public static String selectPwd(String S_Num)
    {
		String result=null;
		try
		{
			Connection con=getConnection();			
			Statement st=con.createStatement();
			String sql="select S_Pwd from student where S_Num='"+S_Num+"'";
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				result=rs.getString(1);
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    	return result;   	
    }
    
    
    //�õ���ʧͼ�����Ϣ���еļ�¼������
    public static int getMaxLBNO()
    {
		int result=0;
		try
		{
			Connection con=getConnection();			
			Statement st=con.createStatement();
			String sql="select MAX(GSBH) from losebook";
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				result=rs.getInt(1);
			}
			rs.close();
			st.close();
			con.close();
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
    //ִ��û�з���ֵ�Ĳ������ķ���
    public static void update(String sql)
    {
    	try
		{
			Connection con=getConnection();			
			Statement st=con.createStatement();			
			st.executeUpdate(sql);						
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
    
          
    
    //��֪�������õ�����鼮�Ļ�����Ϣ
    public static Vector<String> selectAllfrombook(String BookName)
    {
    	Vector<String> v =new Vector<String>();
    	int lenght=0;
    	try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_Name like '%"+BookName+"%'";
			ResultSet rs=st.executeQuery(sql);				
			while(rs.next()){//���������Ϣ��ӵ�����������								
				//String[] middle=new String[6];				
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));				
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return v; 
    } 
    
   //�õ�ͬ��ISBN���鼮������
    public static int getNumfrombdetailedInfo(String ISBN)
    {
		int num=0;
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select count(B_Num) from bdetailedinformation where ISBN='"+ISBN+"'";
			ResultSet rs=st.executeQuery(sql);						
			if(rs.next()){//���������Ϣ��ӵ�����������												
				num=rs.getInt(1);
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return num;
    	
    }
  
  //һ��ISBN�ŵõ�ͬ�ֺ��µ���������Ļ�����Ϣ
    public static Vector<String> selectISBNALlfromdetailInfo(String ISBN)
    {
    	Vector<String> v =new Vector<String>();
    	int lenght=0;
    	try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select B_Num,Borrowed,Ordered,Introduction from bdetailedinformation where ISBN='"+ISBN+"'";
			ResultSet rs=st.executeQuery(sql);				
			while(rs.next()){//���������Ϣ��ӵ�����������								
				//String[] middle=new String[6];				
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));				
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;    	    	
    }
    
    
    //������ŵõ�������
    public static String getAuthor(String BookNO)
    {
		String result=null;
		try
		{
			Connection con=getConnection();			
			Statement st=con.createStatement();			
			String sql="select B_Author from book where B_Num='"+BookNO+"'";
			ResultSet rs=st.executeQuery(sql);			
			if(rs.next())
			{
				result=rs.getString(1);
			}
			System.out.println(result);
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    	return result;
    	
    }
    
   
    //ͨ������ͼ������ߵõ�ͼ��Ļ�����Ϣ
    public static Vector<String> getAuthorAllfromBook(String Author)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_Author like '%"+Author+"%'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));				
			}
			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	
    }
    
    
    //ͨ��������õ�ͼ��Ļ�����Ϣ
    public static Vector<String> getPubAllfrombook(String Publishment)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_Publishment like '%"+Publishment+"%'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������				
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));							
			}
			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	

    }
    
    
    //ͨ�����������ߵõ�ͼ��Ļ�����Ϣ
    public static Vector<String> getBnAuAllfrombook(String BookName,String Author)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_Name like '%"+BookName+"%' and B_Author like '%"+Author+"%'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));								
			}
			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	
    }
    
    //ͨ�������ͳ�����õ�ͼ��Ļ�����Ϣ
    public static Vector<String> getBnCbAllfrombook(String BookName,String Publishment)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_Name like '%"+BookName+"%' and B_Pub like '%"+Publishment+"%'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));								
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	
    }
    
    //ͨ�����ߺͳ�����
    public static Vector<String> getAuCbAllfrombook(String Author,String Publishment)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_Author like '%"+Author+"%' and B_Pub like '%"+Publishment+"%'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));								
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	
    }
    
    //ͨ������ �����ͳ�������в�ѯ
    public static Vector<String> getBnAuCbAllfrombook(String BookName,String Author,String Publishment)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where B_name like '%"+BookName+"%' and B_Author like '%"+Author+"%' and B_Pub like '%"+Publishment+"%'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));								
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	
    }
    
    //ͨ����Ŷ�ISBN��ͼ����Ĳ�ѯ
    public static Vector<String> getISinfromdetails(String BookNo)
    {
    	Vector<String> v =new Vector<String>();    	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,Borrowed,Ordered,Introduction from bdetailedinformation where B_Num='"+BookNo+"'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;     	    	
    }
    
   //ͨ��ISBN��ͬһ��ISBN���µĻ�����Ϣ
    public static Vector<String> getISfrombook(String isbn)
    {
    	Vector<String> v =new Vector<String>();   	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ISBN,B_Name,B_Author,B_Publishment from book where ISBN ='"+isbn+"'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;      	    	
    }
    
    //����ѧ����ID�õ���ԤԼͼ��Ļ�����Ϣ
    public static Vector<String> getBNofromOrder(String stuNo)
    {
    	Vector<String> v =new Vector<String>();   	
    	try
		{
    	//�����ں�̨��ӡ   		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select B_Num,S_Name,S_num,B_Author from orderbook where S_Num ='"+stuNo+"'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
			}			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return v;      	    	
    }
    //����ԤԼͼ����Ϣ��õ�ĳͬѧ��ԤԼͼ����Ϣ
    public static int getNumfromborderreport(String stuno)
    {
		int num=0;
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select count(B_Num) from orderbook where B_Num='"+stuno+"'";
			ResultSet rs=st.executeQuery(sql);						
			if(rs.next()){//���������Ϣ��ӵ�����������												
				num=rs.getInt(1);
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return num;
    	
    }
    
    //����ѧ����ѧ�ŵõ�ͼ���ISBN��BookNO,BookName,Author,Publishment,����ʱ�䣬�黹ʱ��
    public static Vector<String> getSomeInfo(String stuno)
    {
    	Vector<String> result=new Vector<String>();
		try
		{   	
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select record.B_Num,record.BorrowTime,record.ReturnTime,book.ISBN,book.B_Name,book.B_Author,book.B_Pub from record,book,bdetailedinformation where record.B_Num=bdetailedinformation.B_Num AND bdetailedinformation.ISBN=book.ISBN And record.S_Num='"+stuno+"'";
			ResultSet rs=st.executeQuery(sql);
			int num=0;
			while(rs.next()){//���������Ϣ��ӵ�����������												
				result.add(rs.getString(1));
				result.add(rs.getString(2));
				result.add(rs.getString(3));
				result.add(rs.getString(4));
				result.add(rs.getString(5));
				result.add(rs.getString(6));
				result.add(rs.getString(7));				
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
    
    
    
    //����ͼ�����ŵõ�ͼ��Ļ�����Ϣ
    public static Vector<String> getBNSomeInfo(String BookNO)
    {
    	Vector<String> result=new Vector<String>();
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select record.B_Num,record.BorrowTime,record.ReturnTime,book.ISBN,book.B_Name,book.B_Author,book.B_Publishment from record,book,bdetailedinformation where record.B_Num=bdetailedinformation.B_Num AND bdetailedinformation.ISBN=book.ISBN And record.B_Num='"+BookNO+"'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������												
				result.add(rs.getString(1));
				result.add(rs.getString(2));
				result.add(rs.getString(3));
				result.add(rs.getString(4));
				result.add(rs.getString(5));
				result.add(rs.getString(6));
				result.add(rs.getString(7));				
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
    
    //����ԤԼͼ����ŵõ�ͼ�������Ϣ
    public static Vector<String> getBNSomeINFO(String BookNO)
    {
    	Vector<String> result=new Vector<String>();
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select orderbook.B_Num,book.ISBN,book.B_Name,book.B_Author,book.B_Publishment,bdetailedinformation.Borrowed from orderbook,book,bdetailedinformation where orderbook.B_Num=bdetailedinformation.B_Num AND bdetailedinformation.ISBN=book.ISBN And orderbook.B_Num='"+BookNO+"'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������												
				result.add(rs.getString(1));
				result.add(rs.getString(2));
				result.add(rs.getString(3));
				result.add(rs.getString(4));
				result.add(rs.getString(5));
				result.add(rs.getString(6));
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
    
    //ͨ��ѧ����ID�õ�ѧ���İ༶��������ѧ��
    public static String[] getIDClNO(String stuno)
    {
		String[] result=new String[3];
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select S_Num,S_Class,S_Name from student where S_Num='"+stuno+"'";
			ResultSet rs=st.executeQuery(sql);						
			if(rs.next()){//���������Ϣ��ӵ�����������												
				result[0]=rs.getString(1);
				result[1]=rs.getString(2);
				result[2]=rs.getString(3);
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
    
    //ͨ����ŵõ��黹ʱ��
    public static String gettimefromrecord(String BookNo)
    {
		String result=null;
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ReturnTime from record where B_Num='"+BookNo+"'";
			ResultSet rs=st.executeQuery(sql);						
			if(rs.next()){//���������Ϣ��ӵ�����������												
				result=rs.getString(1);				
			}		
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
    
    
    //ͨ������ж�ʱ�����ٽ�״̬
    public static String getifBorrow(String BookNO)
    {
    	String result=null;
		try
		{
    	//�����ں�̨��ӡ    		
			Connection con=getConnection();				
			Statement st=con.createStatement();
			String sql="select ReturnTime from record where B_Num='"+BookNO+"'";
			ResultSet rs=st.executeQuery(sql);			
			while(rs.next()){//���������Ϣ��ӵ�����������												
				result=rs.getString(1);						
			}		
			rs.close();
			st.close();
			con.close();
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
    	return result;
    	
    }
   
}

