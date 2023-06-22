package IntPkg;

public class SumofDegits {

	public static void main(String[] args) {
		
		int num=123456;
		
		int sum=0;
		while(num>0) {
			
			sum=sum+num%10;
			num=num/10;
			
		}

		System.out.println("Sum of the No is :-  "+sum);
	}

}
