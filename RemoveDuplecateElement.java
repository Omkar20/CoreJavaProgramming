package StringPkg;

public class RemoveDuplecateElement {

	public static void main(String[] args) {
		
		String str="aaabbcccdddeffff";
		
		for(int i=0;i<str.length();i++) {
			int x=str.charAt(i);
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					x=0;
				}
			}
			
			if(x!=0) {
				System.out.println(str.charAt(i));
			}

		}
		
		
	}

}
