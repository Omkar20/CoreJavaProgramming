package ArrayPkg;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNosWithCount {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,30,20};
		
		Map<Integer, Integer>map= new HashMap<Integer, Integer>();
		for(Integer ch: arr) {
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
		}
		map.forEach(  (key,value )->{
			System.out.println(key+" "+value);
		});

	}

}
