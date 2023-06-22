package IntPkg;

import java.util.HashMap;
import java.util.Map;

public class CountEachNos_Map {

	public static void main(String[] args) {
		
         int arr[]= {10,20,20,30,30,40,40,40};
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(Integer st: arr) {
			
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
