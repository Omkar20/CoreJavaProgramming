package ArrayPkg;

import java.util.Arrays;

public class CountNoOfElementsInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println("Even No is:-");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
			else {
				System.out.println("Odd No is:-");
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
