package ArrayPkg;

public class SortingArrayInDecendingOrder {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6,9,3,21,35};
		int size=arr.length;
		int temp=0;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
				
	}

}
