package StringPkg;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		String str="I am a boy";
		str=str.toLowerCase();
		int vcount=0;
		int ccount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				ccount++;
			}
		}
		System.out.println("Vowel count is:- "+vcount);
		System.out.println("Consonant count is:- "+ccount);

	}

}
