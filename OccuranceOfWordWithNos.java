package StringPkg;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordWithNos {

	public static void main(String[] args) {
		
		String str="Learn Java Learn API Learn Python";
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for(String st: str.split(" ")) {
			
			if(map.get(st)==null) {
				map.put(st, 1);
			}
			else {
				map.put(st, map.get(st)+1);
			}
		}
		
		map.forEach(  (key, value )->{System.out.println(key+" "+value);}   );

	}

}
