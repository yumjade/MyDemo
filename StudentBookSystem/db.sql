drop table losebook;
drop table overtime;
drop table manager;
drop table record;
drop table orderbook;
drop table student;
drop table book;
drop table bdetailedinformation;

create table book
(
   ISBN varchar(20) primary key,
   B_Name varchar(50),
   B_Author varchar(50),   
   B_Publishment varchar(80),
   B_BuyTime varchar(50)
);
insert into book values('9787302164289','3ds max 9��ά��ģ','�̷��','�廪��ѧ������','2010-02-01');
insert into book values('9787121060953','photoshop cs3 ͼ����','׿Խ�Ƽ�','���ӹ�ҵ������','2003-02-01');
insert into book values('9787121102462','Java����Աְ��ȫ����-��С����ר��','���Ƿ�','���ӹ�ҵ������','2004-04-05');
insert into book values('9787115227508','Android 2.0��Ϸ����ʵս����','���Ƿ�','�����ʵ������','2003-06-07');
insert into book values('9787030236630','PowerBuilder_10.5ʵ�ý̳�','������','��ѧ������','2005-07-05');
insert into book values('9787121079528','PowerBuilder ʵ�ý̳̣���3�棩','֣����','���ӹ�ҵ������','2005-07-09');
insert into book values('9787302244158','��ѧ�����������21������ͨ��У����������γ̹滮�̲ģ�','��ޱ�������� ','�廪��ѧ������','2005-0-09');
insert into book values('9787562324560','΢�ͼ����ԭ��Ӧ��','���ٹ⣬������','��������ѧ������','2005-07-09');
insert into book values('9787111187776','�㷨����','������������Cormen,T.H.�� �������˽�� ����','��е��ҵ������','2005-07-09');

ͼ����ϸ��Ϣ��
drop table bdetailedinformation;
create table bdetailedinformation
(
   B_Num varchar(20) primary key,      
   ISBN varchar(20),     
   Borrowed varchar(50),
   Ordered varchar(50),
   Introduction varchar(1000)
);


insert into bdetailedinformation values('10001','9787302164289','��','��','����ͨ��ͨ���׶���ʵ������,�Ӽ򵥽�ģ�����Ӷ���������,�𲽽��������붯�������');

insert into bdetailedinformation values('10002','9787302164289','��','��','����ͨ��ͨ���׶���ʵ������,�Ӽ򵥽�ģ�����Ӷ���������,�𲽽��������붯�������');

insert into bdetailedinformation values('10003','9787302164289','��','��','����ͨ��ͨ���׶���ʵ������,�Ӽ򵥽�ģ�����Ӷ���������,�𲽽��������붯�������');

insert into bdetailedinformation values('10004','9787302164289','��','��','����ͨ��ͨ���׶���ʵ������,�Ӽ򵥽�ģ�����Ӷ���������,�𲽽��������붯�������');

insert into bdetailedinformation values('10005','9787121060953','��','��','����������ӱ,��ʽ����,����ǳ���׶�,���������ḻ,ÿ����֪ʶ����+ʵս����+�ϻ���ϰΪ���⹹');

insert into bdetailedinformation values('10006','9787121060953','��','��','����������ӱ,��ʽ����,����ǳ���׶�,���������ḻ,ÿ����֪ʶ����+ʵս����+�ϻ���ϰΪ����ṹ');

insert into bdetailedinformation values('10007','9787121102462','��','��','�����԰��������IT�󽭺�Ϊ����,��Javaְ���д�����ǰ��ѧУ����ɳ�Ϊ������ţ�Ĺ���չ�ָ�����,���ݱ������ֲ�ʧȤζ��.�ڱ����м�����ְǰ����ҵ̽�������ų�,Ҳ����ְ��Ŀھ����ںͽ��������������');

insert into bdetailedinformation values('10008','9787121102462','��','��','�����԰��������IT�󽭺�Ϊ����,��Javaְ���д�����ǰ��ѧУ����ɳ�Ϊ������ţ�Ĺ���չ�ָ�����,���ݱ������ֲ�ʧȤζ��.�ڱ����м�����ְǰ����ҵ̽�ء������ų�,Ҳ����ְ��Ŀھ����ںͽ��������������');


insert into bdetailedinformation values('10009','9787115227508','��','��','������Android�ֻ���Ϸ�Ŀ���Ϊ����,�����ʵ����Ϸ�����������ϸ������Androidƽ̨����Ϸ��������������,ͬʱ����Ϸ�����Ľ��ܹ����л������˱��߶�����۵Ŀ��������뾭��');

insert into bdetailedinformation values('10010','9787115227508','��','��','������Android�ֻ���Ϸ�Ŀ���Ϊ����,�����ʵ����Ϸ�����������ϸ������Androidƽ̨����Ϸ��������������,ͬʱ����Ϸ�����Ľ��ܹ����л������˱��߶�����۵Ŀ��������뾭��');

insert into bdetailedinformation values('10011','9787030236630','��','��','����ϵͳ������PowerBuilder 10.5�����ɼ�������,�¼��ͺ���,�Թ���PowerBuilder�ĸ��ֶ���(Ӧ��,����,�˵�,�ؼ�,���ݴ���,�û�����)�Լ����ǵĴ�����ʹ�÷���������������ϸ����');

insert into bdetailedinformation values('10012','9787030236630','��','��','����ϵͳ������PowerBuilder 10.5�����ɼ�������,�¼��ͺ���,�Թ���PowerBuilder�ĸ��ֶ���(Ӧ��,����,�˵�,�ؼ�,���ݴ���,�û�����)�Լ����ǵĴ�����ʹ�÷���������������ϸ����');


insert into bdetailedinformation values('10013','9787030236630','��','��','����ϵͳ������PowerBuilder 10.5�����ɼ�������,�¼��ͺ���,�Թ���PowerBuilder�ĸ��ֶ���(Ӧ��,����,�˵�,�ؼ�,���ݴ���,�û�����)�Լ����ǵĴ�����ʹ�÷���������������ϸ����');
insert into bdetailedinformation values('10014','9787030236630','��','��','����ϵͳ������PowerBuilder 10.5�����ɼ�������,�¼��ͺ���,�Թ���PowerBuilder�ĸ��ֶ���(Ӧ��,����,�˵�,�ؼ�,���ݴ���,�û�����)�Լ����ǵĴ�����ʹ�÷���������������ϸ����');




insert into bdetailedinformation values('10015','9787121079528','��','��','�������ʵ�ý̳�,ϰ��,�ϻ�����ָ�����ۺ�Ӧ��ʵϰ��4����.ʵ�ý̳̱Ƚ�ϵͳ�ؽ�����PowerBuilder 9.0��������,PowerScript����,���ڼ����ڿؼ�,�������ݿ�,���ݴ��ڶ��󼰿ؼ�,�û��Զ�������¼������ͽṹ,ѡ��,SQL���,�α�,���ݹܵ�,PBL���������');



insert into bdetailedinformation values('10016','9787121079528','��','��','�������ʵ�ý̳�,ϰ��,�ϻ�����ָ�����ۺ�Ӧ��ʵϰ��4����.ʵ�ý̳̱Ƚ�ϵͳ�ؽ�����PowerBuilder 9.0��������,PowerScript����,���ڼ����ڿؼ�,�������ݿ�,���ݴ��ڶ��󼰿ؼ�,�û��Զ�������¼������ͽṹ,ѡ��,SQL���,�α�,���ݹܵ�,PBL���������');




insert into bdetailedinformation values('10017','9787121079528','��','��','�������ʵ�ý̳�,ϰ��,�ϻ�����ָ�����ۺ�Ӧ��ʵϰ��4����.ʵ�ý̳̱Ƚ�ϵͳ�ؽ�����PowerBuilder 9.0��������,PowerScript����,���ڼ����ڿؼ�,�������ݿ�,���ݴ��ڶ��󼰿ؼ�,�û��Զ�������¼������ͽṹ,ѡ��,SQL���,�α�,���ݹܵ�,PBL���������');



insert into bdetailedinformation values('10018','9787121079528','��','��','�������ʵ�ý̳�,ϰ��,�ϻ�����ָ�����ۺ�Ӧ��ʵϰ��4����.ʵ�ý̳̱Ƚ�ϵͳ�ؽ�����PowerBuilder 9.0��������,PowerScript����,���ڼ����ڿؼ�,�������ݿ�,���ݴ��ڶ��󼰿ؼ�,�û��Զ�������¼������ͽṹ,ѡ��,SQL���,�α�,���ݹܵ�,PBL���������');



insert into bdetailedinformation values('10019','9787302244158','��','��','�����ע�ػ���ԭ��ͷ����Ĳ���,��ע��ʵ������������,��������ʵ�����ϵķ�ʽ����ѧ����Ӧ������.');


insert into bdetailedinformation values('10020','9787302244158','��','��','�����ע�ػ���ԭ��ͷ����Ĳ���,��ע��ʵ������������,��������ʵ�����ϵķ�ʽ����ѧ����Ӧ������.');


insert into bdetailedinformation values('10021','9787302244158','��','��','�����ע�ػ���ԭ��ͷ����Ĳ���,��ע��ʵ������������,��������ʵ�����ϵķ�ʽ����ѧ����Ӧ������.');

insert into bdetailedinformation values('10022','9787562324560','��','��','����ȫ������ؽ�����΢�ͼ�����Ļ������,����ԭ���ʵ��Ӧ��.ȫ�鹲10��,ѭ�򽥽��ؽ�����΢�ͼ�����Ļ���֪ʶ,��8086��19entium 4΢���������ڲ��ṹ���ص�,Ѱַ��ʽ,ָ��ϵͳ��������Գ������,�뵼��洢��,8086�ж�ϵͳ,����������ӿڼ���,MSC-51��Ƭ���Ĺ��ܼ�����չ����');


insert into bdetailedinformation values('10023','9787562324560','��','��','����ȫ������ؽ�����΢�ͼ�����Ļ������,����ԭ���ʵ��Ӧ��.ȫ�鹲10��,ѭ�򽥽��ؽ�����΢�ͼ�����Ļ���֪ʶ,��8086��19entium 4΢���������ڲ��ṹ���ص�,Ѱַ��ʽ,ָ��ϵͳ��������Գ������,�뵼��洢��,8086�ж�ϵͳ,����������ӿڼ���,MSC-51��Ƭ���Ĺ��ܼ�����չ����');


insert into bdetailedinformation values('10024','9787111187776','��','��','�����������۸����㷨,������ʹ��Щ�㷨����ƺͷ�����Ϊ������εĶ��߽���.�����Գ���ϵ,������Ϊ������ѧϰ��Ԫ���㷨��Ӣ���α�������ʽ����,�߱�����������ƾ�����˾��ܿ���.˵���ͽ�������ǳ���׶�,��ʧ��Ⱥ���ѧ�Ͻ���');


insert into bdetailedinformation values('10025','9787111187776','��','��','�����������۸����㷨,������ʹ��Щ�㷨����ƺͷ�����Ϊ������εĶ��߽���.�����Գ���ϵ,������Ϊ������ѧϰ��Ԫ���㷨��Ӣ���α�������ʽ����,�߱�����������ƾ�����˾��ܿ���.˵���ͽ�������ǳ���׶�,��ʧ��Ⱥ���ѧ�Ͻ���');

insert into bdetailedinformation values('10026','9787111187776','��','��','�����������۸����㷨,������ʹ��Щ�㷨����ƺͷ�����Ϊ������εĶ��߽���.�����Գ���ϵ,������Ϊ������ѧϰ��Ԫ���㷨��Ӣ���α�������ʽ����,�߱�����������ƾ�����˾��ܿ���.˵���ͽ�������ǳ���׶�,��ʧ��Ⱥ���ѧ�Ͻ���');



create table student
(
  S_Num varchar(20) primary key,
  S_Name varchar(50),
  S_Age varchar(10),
  S_Sex varchar(50),
  S_Class varchar(50),
  S_Department varchar(50),
  S_Phone varchar(11),
  S_Permitted varchar(50),
  S_Pwd varchar(20)
);

insert into student values('10001','����','20','Ů','�����1��','�����ϵ','15176536034','��','001');
insert into student values('10002','����',21,'Ů','�����1��','�����ϵ','13730220123','��','002');
insert into student values('10003','���',20,'��','�����1��','�����ϵ','13633654578','��','003');
insert into student values('10004','�ι�',22,'��','�����1��','�����ϵ','2578975','��','004');
insert into student values('10005','����',21,'Ů','�����1��','�����ϵ','13936968956','��','005');
insert into student values('10006','�����',20,'��','�����2��','�����ϵ','1234667','��','006');


//����ͼ����Ϣ���
create table record
(
   B_Num varchar(50) primary key,
   S_Num varchar(20),
   BorrowTime varchar(50),
   ReturnTime varchar(50),
   Borrowed varchar(50),
   Ordered varchar(50)
);

insert into record values('10001','10001','2010-1-2','2010-3-2','��','��');
insert into record values('10002','10001','2010-1-23','2010-3-23','��','��');
insert into record values('10006','10001','2010-1-2','2010-3-2','��','��');
insert into record values('10008','10002','2010-1-2','2010-3-2','��','��');
insert into record values('10009','10001','2010-1-2','2010-3-2','��','��');

insert into record values('10010','10002','2010-1-2','2010-3-2','��','��');
insert into record values('10011','10001','2010-2-2','2010-4-2','��','��');
insert into record values('10020','10002','2010-1-2','2010-3-2','��','��');
insert into record values('10021','10001','2010-2-2','2010-4-2','��','��');
insert into record values('10025','10002','2010-1-2','2010-3-2','��','��');
insert into record values('10024','10002','2010-1-2','2010-3-2','��','��');
insert into record values('10026','10002','2010-1-2','2010-3-2','��','��');




create table orderbook
(
   B_Num varchar(50) primary key,
   S_Name varchar(50),
   S_Class varchar(50),
   B_Name varchar(50),
   S_Num varchar(20),
   B_Author varchar(50)
);

create table losebook
(
   GSBH int primary key,
   B_Num varchar(50), 
   B_Name varchar(50),
   S_Num varchar(20)
);



create table manager
(
   M_Num varchar(20) primary key,
   M_Permitted varchar(50),
   M_Pwd varchar(50)
);
insert into manager values('456','�߼�','123');



create table overtime
(
   S_Num varchar(20),
   B_Num varchar(20),
   B_Name varchar(50),
   overtime int(20),
   primary key(S_Num,B_Num)
);


insert into overtime values('10002','10020','��ѧ�����������21������ͨ��У����������γ̹滮�̲ģ�',null);
insert into overtime values('10002','10024','�㷨����',null);
insert into overtime values('10002','10025','�㷨����',null);




