package IntPkg;

public class PerfectNo {

	public static void main(String[] args) {
		
		int num=6;
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("Perfect no");
		}
		else {
			System.out.println("Not perfect no");
		}

	}

}
