package StringPkg;

public class ReverseAsentence {

	public static void main(String[] args) {
		
		String sen="Java is world";
		String word="";
		String revsen="";
		
		sen=sen+" ";
		
		for(int i=0;i<sen.length();i++) {
			char ch=sen.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}
			else {
				revsen=word+" "+revsen; //Sentence will reverse here
				word=""; //word will empty here to take next word.
			}
		}
		System.out.println(revsen);

	}

}
