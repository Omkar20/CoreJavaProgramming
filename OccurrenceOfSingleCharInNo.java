package StringPkg;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfSingleCharInNo {

	public static void main(String[] args) {
		
		String str="Java Programming Java Oops";
		
		int len1=str.length();
		int len2=str.replaceAll("a", "").length();
		int totallen=len1-len2;
		
		System.out.println(totallen);
		
	}

}
