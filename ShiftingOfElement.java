package ArrayPkg;

public class ShiftingOfElement {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int n=3;
		
		for(int i=1;i<n;i++) {
			
			//Storing first element in a variable.
			int first=arr[0];
			int j;
			
			for(j=0;j<arr.length-1;j++) {
				
				//Shifting 1 element to left
				arr[j]=arr[j+1];
			}
			//shifting first element to end
			arr[j]=first;
			
		}
		//Printing the array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
