package ArrayPkg;

public class LargestNo_3 {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,2,5,6,8,7};
		int size=arr.length;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.print(arr[size-3]);

	}

}
