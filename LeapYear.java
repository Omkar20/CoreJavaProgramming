package IntPkg;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=2016;
		
		if((year%400==0) || (year%4==0)&& (year%100!=0)    ) {
			System.out.println(year+" Leap year");
		}
		else {
			System.out.println(year+" Not leap year ");
		}

	}

}
