package coreJava;

public class SubClass extends SuperClass {
	   SubClass(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	   
	int num = 10;

	   // display method of sub class
	   public void display() {
	      System.out.println("This is the display method of subclass");
	   }

	   public void my_method(SubClass sub) {
	      // Instantiating subclass
	     sub = new SubClass(25);
	      sub.display();
	      sub.getAge();
	      // Invoking the display() method of superclass
	      super.display();

	      // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ sub.num);

	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	   }

	   public static void main(String args[]) {
	      SuperClass obj = new SubClass(45);
	      //obj.my_method(obj);
	      obj.getAge();
	   }
}