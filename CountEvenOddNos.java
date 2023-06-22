package IntPkg;

public class CountEvenOddNos {

	public static void main(String[] args) {
		
		int num=12345678;
		int rem;
		int evencount=0;
		int oddcount=0;
		
		
		while(num>0) {
			rem=num%10;
			
			if(rem%2==0) {
				evencount++;
				
			}
			else {
				oddcount++;
				
			}
			num=num/10;
		}
		
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
