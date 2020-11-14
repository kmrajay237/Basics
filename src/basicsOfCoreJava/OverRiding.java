package basicsOfCoreJava;
class Parent {
	public void property() {
		System.out.println("Land+Ca$h+Gold");
	}

	public void marry() {
		System.out.println("Shruti | Tara | Aliya");
	}
}

class Child extends Parent {
	public void marry() {
		System.out.println("Shradha");
	}
	public void honeymoon() {
		System.out.println("Goa+Simla");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.property(); //Land+Ca$h+Gold
		parent.marry(); //Shruti | Tara | Aliya
		
		Parent duplicateparent=new Child();
		duplicateparent.property(); //Land+Ca$h+Gold
		duplicateparent.marry(); //Shradha

		Child child=new Child();
		child.marry(); //Shradha
		child.honeymoon(); //Goa+Simla
	}
}
