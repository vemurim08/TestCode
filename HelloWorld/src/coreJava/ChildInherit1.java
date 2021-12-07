package coreJava;

public class ChildInherit1 extends ParentInherit1{

String name ="QAClickAcademy";


public ChildInherit1()
{
super();// this should be always be at first line
System.out.println("child class construtor");

}
public void getStringdata()
{
System.out.println(name);
System.out.println(super.name);
}


public void getData()
{
super.getData();
System.out.println("I am in child class");
}
public static void main(String[] args) {
// TODO Auto-generated method stub



ChildInherit1 cd = new ChildInherit1();

cd.getStringdata();
cd.getData();
}

}