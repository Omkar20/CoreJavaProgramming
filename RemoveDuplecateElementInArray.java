package ArrayPkg;

public class RemoveDuplecateElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,2,2,3,3,4,4,4,5,6,7,8,8};
		
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					x=0;
				}
			}
			if(x!=0) {
				System.out.print(x+" ");
			}
		}
		
		
		

	}

}
