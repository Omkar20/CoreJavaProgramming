package ArrayPkg;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","c++","c","c++"};
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				
					System.out.println(arr[i]);
					flag=true;
				}
				
			}
		}
		
		if(flag==false) {
			System.out.println("No duplecate found");
		}

	}

}
