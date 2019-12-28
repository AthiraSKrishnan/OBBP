<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="obbp.Bl.*,obbp.Dto.*"%>
<%
int opos,oneg,apos,aneg,bpos,bneg,abpos,abneg,result;

opos=Integer.parseInt(request.getParameter("Opos"));
oneg=Integer.parseInt(request.getParameter("Oneg"));
apos=Integer.parseInt(request.getParameter("Apos"));
aneg=Integer.parseInt(request.getParameter("Aneg"));
bpos=Integer.parseInt(request.getParameter("Bpos"));
bneg=Integer.parseInt(request.getParameter("Bneg"));
abpos=Integer.parseInt(request.getParameter("ABpos"));
abneg=Integer.parseInt(request.getParameter("ABneg"));
Campbloodquantity blood= new Campbloodquantity();
blood.setOpos(opos);
blood.setOneg(oneg);
blood.setApos(apos);
blood.setAneg(aneg);
blood.setBpos(bpos);
blood.setBneg(bneg);
blood.setABpos(abpos);
blood.setABneg(abneg);

result=CampBl.updateBlood(blood);
if(result>0)
{
	System.out.println("pass");
}
else
{
	System.out.println("faild");
}

%>
