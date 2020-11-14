package basicsOfCoreJava;

public interface MainInterface {
	void property();

	void shaadi();

	default void honeymoon() {
		System.out.println("Bihar");
	}

	static void tilak() {
		System.out.println("1 Crore");
	}
}

class ParentsPlan implements MainInterface {
	public void property() {
		System.out.println("Land+Ca$h+Gold");
	}

	public void shaadi() {
		System.out.println("Shruti|Kajal|Samantha");
	}
}

class RebelionKids extends ParentsPlan {
	public void shaadi() {
		System.out.println("Katrina");
	}
}

