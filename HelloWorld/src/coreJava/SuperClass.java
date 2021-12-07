package coreJava;

class SuperClass {
	
	int age;
	int num=20;
	
	SuperClass(int age) {
	      this.age = age; 		 
	   }
	   // display method of superclass
	   public void display() {
	      System.out.println("This is the display method of superclass");
	   }
	   public void getAge() {
		      System.out.println("The value of the variable named age in super class is: " +age);
		   }
	}