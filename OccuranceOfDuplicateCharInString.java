package StringPkg;

public class OccuranceOfDuplicateCharInString {

	public static void main(String[] args) {
		
		String str="Java is king";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' '){
					System.out.println(str.charAt(i));
				}
			}
		}

	}

}
