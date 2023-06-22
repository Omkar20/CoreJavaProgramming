package ArrayPkg;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfOnlyDuplicateNosWithCount {

	public static void main(String[] args) {
		
		int arr[]= {10,20,20,30,30,40,50};
		
		Map<Integer, Integer>map= new HashMap<Integer,Integer>();
		
		for(Integer ch: arr) {
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
			
			if(map.get(ch)>1) {
				System.out.println(ch+"-"+map.get(ch));
			}
		}

	}

}
