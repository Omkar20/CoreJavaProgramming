package StringPkg;

public class SuperClassConstructor extends ConstructorCalling{
	
	SuperClassConstructor(){
		super();
		System.out.println("It is a default constructor");
	}

	public static void main(String[] args) {
		
		SuperClassConstructor sb= new SuperClassConstructor();

	}

}
