package StringPkg;

public class LongestWord_SmallestWord {

	public static void main(String[] args) {
		
		String str="I am staying in bhubaneswar";
		str=str+" ";
		 String word="";
		 String longword="";
		 String smallword="";
		 
		 int wordlen=0;
		 int longwordlen=0;
		 int smallwordlen=0;
		 
		 smallwordlen=str.length();
		 
		 for(int i=0;i<str.length();i++) {
			 
			 char ch=str.charAt(i);
			 if(ch==' ') {
				 
				 wordlen=word.length();
				 
				 if(wordlen>longwordlen) {
					 longwordlen=wordlen;
					 longword=word;
				 }
				 
				 if(wordlen<smallwordlen) {
					 smallwordlen=wordlen;
					 smallword=word;
				 }
				 
				 word="";
				 
			 }
			 else {
				 word=word+ch;
			 }
		 }
		 
		 System.out.println("Longest word is:- "+longword);
		 System.out.println("Smallest word is:- "+smallword);
		 
		 System.out.println("Longest length is:-  "+longwordlen);
		 System.out.println("Smallest length is:-  "+smallwordlen);

	}

}
