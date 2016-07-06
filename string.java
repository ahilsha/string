import java.io.*;
import java.util.*;
import java.lang.*; 
class Emp
{  
String name;
int salary;
Emp()
{
name=" ";
salary=0;
}
Emp(String s1,int s)
{
name=s1;
salary=s;
}
public String toString()
{
return name+salary;
}
}
class Empl
{
 public static void main(String[] args)
{   
HashSet<Emp> ts=new HashSet<Emp>();
ts.add(new Emp("Ram",3000));
ts.add(new Emp("Akil",4000));
ts.add(new Emp("Kavi",5000));
ts.add(new Emp("Anand",6000));
for(Emp e:ts)
{
System.out.println(e.toString());
}
}
}
