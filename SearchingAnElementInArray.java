package ArrayPkg;

public class SearchingAnElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		int search=20;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element is present in Array");
				flag=true;
			}
			
		}
		
		if(flag==false) {
			System.out.println("Element is not present in Array");
		}
	}

}
