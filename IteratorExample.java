package StringPkg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String>name=Arrays.asList("omkar","kumar","dash","i","m","boy");
		Iterator<String>nameiterate=name.iterator();
		while(nameiterate.hasNext()) {
			System.out.println(nameiterate.next());
		}

	}

}
