package StringPkg;

public class ConstructorCalling {
	
	String name;
	String country;
	int age;
	int salary;
	
	ConstructorCalling(){
		this("omkar",2000,"India");
		System.out.println("Default Constructer");
	}
	
	ConstructorCalling(String name, int age, String country){
		//this();
		System.out.println("Parameterize Constructer");
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		ConstructorCalling call= new ConstructorCalling();
		
		//ConstructorCalling call= new ConstructorCalling("omkar",2000,"India");

	}

}
