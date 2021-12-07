package coreJava;

public class ChildAbstract extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract ca= new ChildAbstract();
		ca.bodyColor();
		ca.safetyGuidelines();
		ca.engine();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
	System.out.println("bodycolor");	
	}

}
