package StringPkg;

public class ReverseAString_Algorithem {

	public static void main(String[] args) {
		
		String str="ABCDEF";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse is:- "+rev);

	}

}
