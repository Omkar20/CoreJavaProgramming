package IntPkg;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {
		Random randm=new Random();
		int num=randm.nextInt(1000000);
		System.out.println(num);
		
		//String randnum=RandomStringUtils.randonnumeric(7);
		//String randstring=RandomStringUtils.alfabetic(7);

	}

}
