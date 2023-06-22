package IntPkg;

public class ReverseANoByStringBuffer {

	public static void main(String[] args) {
		
		int num=12345678;
		
		StringBuffer sb= new StringBuffer();
		
		//StringBuilder sb= new StringBuilder(String.valueOf(num));
		
		sb.append(num);
		StringBuffer rev=sb.reverse();
		
		System.out.println(rev);
		
	}

}
