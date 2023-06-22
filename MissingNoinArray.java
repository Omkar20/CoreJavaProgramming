package ArrayPkg;

public class MissingNoinArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=0;i<=5;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		int actualsum=sum1-sum;
		
		System.out.println("Missing Element is:"+actualsum);

	}

}
