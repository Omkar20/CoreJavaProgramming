package IntPkg;

public class PalindromNo {

	public static void main(String[] args) {
		
		int num=16461;
		int org_no=num;
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_no==rev) {
			System.out.println("No is Palendrom");
		}
		else {
			System.out.println("No is not Palendrom");
		}

	}

}
