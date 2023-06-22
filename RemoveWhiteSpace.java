package StringPkg;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str= "Om     ka     r";
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
