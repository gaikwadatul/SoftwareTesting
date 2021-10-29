package collection;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		Map m1=new HashMap();
		m1.put("key1", "Admin");
		m1.put("key2", "Admin");
		m1.put(null, "Admin13");
		System.out.println("Map element are: "+m1);
		System.out.println("Map element are: "+m1.size());
		
		m1.put("key1", "Manager");
		m1.put(null, 1);
		System.out.println("Map element are: "+m1);
		System.out.println("Map element are: "+m1.size());
		
		

	}

}
