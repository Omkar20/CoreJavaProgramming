package IntPkg;

public class AmstrongNo {

	public static void main(String[] args) {
		
		int num=153;
		int orgNum=num;
		int rem=0;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;
			
		}
		if(orgNum==sum) {
		System.out.println("Amstrong Number");
	}
		else {
			System.out.println("Not Amstrong Number");
		}
		
		
	}
}
