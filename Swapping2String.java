package StringPkg;

public class Swapping2String {

	public static void main(String[] args) {
		
		String s1="Good";
		String s2="Morning";
		
		String str=s1+s2;
		
		s2=str.substring(0,str.length()-s2.length());
		s1=str.substring(s2.length());
		
		System.out.println(s1+" "+s2);
		
	}

}
