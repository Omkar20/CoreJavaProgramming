package ArrayPkg;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		boolean status=false;
		
		status=Arrays.equals(arr1, arr2);
		
		if(status==true) {
			System.out.println("Both arrays are equal");
		}
		if(status==false) {
			System.out.println("Both arrays are not equal");
		}

	}

}
