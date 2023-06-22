package IntPkg;

public class EvenNo_OddNo {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int evencount=0;
		int oddcount=0;
		
		System.out.println("Even No is:-");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount++;
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd No is:-");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddcount++;
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Even count is:-"+evencount);
		System.out.println("Odd count is:-"+oddcount);

	}

}
