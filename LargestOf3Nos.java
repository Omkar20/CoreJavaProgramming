package IntPkg;

public class LargestOf3Nos {

	public static void main(String[] args) {
		int a=2;
		int b=4;
		int c=1;
		
		if(a>b && a>c) {
			System.out.println("Largest No is:-"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest No is:-"+b);
		}
		else if(c>a && c>b) {
			System.out.println("Largest No is:-"+c);
		}

	}

}
