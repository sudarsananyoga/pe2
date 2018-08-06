package com.stackroute.pe2;
class Member
{
 protected String name="";
 protected int age;
 protected float salary;
  int res;
}
public class MemberVariable extends Member
{
    MemberVariable(String name,int age,float salary)
    {
    	this.name=name;
    	this.age=age;
    	this.salary=salary;
    }
    public String var()
    {
    	String res=this.name+" "+this.age+" "+this.salary;
    	return res;
    }
}
