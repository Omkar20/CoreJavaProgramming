package StringPkg;

public class ReverseAstringStringBuilder {

	public static void main(String[] args) {
		
		String str="ABCDEF";
		
		StringBuilder sb= new StringBuilder(str);
		StringBuilder rev=sb.reverse();
		System.out.println("Reverse String is:- "+ rev);

	}

}
