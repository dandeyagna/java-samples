package utilityClasses;

import java.util.*;

class HashMapDemo {
   public static void main(String args[]) {

	HashMap<String,String> hm = new HashMap<String,String>();
	
	hm.put("A1", "9881145241");	
	hm.put("B2", "9881145242");
	hm.put("C3", "9881145243");
	hm.put("D4", "9881145244");
	hm.put("E5", "9881145245");
	
	System.out.println("Phone number of E5 is"+(hm.get("E5")).toString());
	
	for(String s: hm.values()){
		System.out.println(s);
	}
	
	for(Map.Entry<String, String> entry : hm.entrySet()){
		System.out.println(entry.getKey()+" - "+entry.getValue());
	}
		
   }
}