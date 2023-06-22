package ArrayPkg;

public class Max_MinInArray {

	public static void main(String[] args) {
		
		int arr[]= {20,30,23,1};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum array is: "+max);
		System.out.println("Minimum array is: "+min);

	}

}
