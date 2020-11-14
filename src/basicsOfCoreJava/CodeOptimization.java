package basicsOfCoreJava;
public class CodeOptimization {
	public static void main(String[] args) {
		String refvar = GrandChild.grandChild().grandParent();
		System.out.println(refvar);
	}
}

class GrandParent{
	String refVariable="Hello World";
	public String grandParent() {
		System.out.println("grandParent Method in GrandParent Class");
		return refVariable;
	}
}

class GrandChild{
	public static GrandParent grandChild() {
		System.out.println("grandChild Method in GrandChild Class");
		return new GrandParent();
	}
}
