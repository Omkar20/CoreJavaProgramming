package ArrayPkg;

import java.util.Arrays;

public class ArrayMerging {

	public static void main(String[] args) {
		
		int a[]= {3,1,2,4};
		int b[]= {6,8,7,9};
		
		int c[]= new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}

}
