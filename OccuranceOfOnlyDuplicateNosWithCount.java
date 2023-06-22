package StringPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfOnlyDuplicateNosWithCount {

	public static void main(String[] args) {
		
String str="football";
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		for(char ch : str.toCharArray()) {
			if(map.get(ch)==null) {
				
				map.put(ch, 1);
			}
			else{
				map.put(ch, map.get(ch)+1);
			}
			if(map.get(ch)>1) {
				System.out.println(ch+" "+map.get(ch));
			}
		}
		System.out.println();
		map.forEach(  (key,value)->{System.out.println(key+" "+value);}   );
		
		

	}

}
