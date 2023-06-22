package StringPkg;

public class CountSplCharsInString {

	public static void main(String[] args) {
		
		String str="i am ; a ,? boy>";
		int splcount=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==';'|| str.charAt(i)==','|| str.charAt(i)=='?'|| str.charAt(i)=='>') {
				splcount++;
			}
			//Extra part
			
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				count++;
			}
		}

		System.out.println(splcount);
		System.out.println(count);
	}

}
