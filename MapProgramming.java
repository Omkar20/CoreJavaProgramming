package IntPkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapProgramming {

	public static void main(String[] args) {
		
		
		Map<String,Integer>map= new HashMap<String,Integer>();
		map.put("omm",10);
		map.put("kumar",20);
		map.put("dash",30);
		
		
		Set<Map.Entry<String, Integer>>set=map.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		

	}

}
