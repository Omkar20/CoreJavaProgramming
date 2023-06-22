package StringPkg;

public class DividingStringToEqualNos {

	public static void main(String[] args) {
		
		String str="aabbccdd";
		int n=2;
		int len=str.length();
		int chars=len/n;
		
		if(len%n!=0) {
			System.out.println("String can not be devided into equal parts");
		}
		else {
			for(int i=0;i<str.length();i=i+chars) {
				
				String part=str.substring(i,i+chars);
				System.out.println(part);
			}
		}

	}

}
