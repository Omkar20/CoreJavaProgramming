package StringPkg;

public class PalindromString {

	public static void main(String[] args) {
		
		String str="MADAM";
		String orgStr=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(orgStr)) {
			System.out.println("Palendrom String");
		}
		else {
			System.out.println("Not Palendrom String");
		}

	}

}
