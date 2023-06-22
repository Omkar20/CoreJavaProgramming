package StringPkg;

public class RemoveJunkSpecialchar {

	public static void main(String[] args) {
		
		String str="!AA#@$%OMKAR()*&^";
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		

	}

}
