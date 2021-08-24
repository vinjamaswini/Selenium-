package collections;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<String,String> hashmap= new HashMap();
		hashmap.put("KCR","986666666");
		hashmap.put("Tony","98678787");
		hashmap.put("Jhon","98768787");
		hashmap.put("Michel","98609090");
		hashmap.put("Tina","898766554");
		hashmap.put("KTR","986666666");
		//System.out.println(hashmap);
		 for (String key : hashmap.values()) {
	            System.out.println(key);
	        }
		
		
		
		
	}

}
