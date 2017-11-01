package utilityClasses;

import java.util.HashSet;

class HashSetDemo {
  public static void main(String args[]) {

	HashSet<String> hs = new HashSet<String>();

	hs.add("A");
	hs.add("C");
	hs.add("A");
	hs.add("B");
	hs.add("A");
	hs.add("A");
	
	for(String s:hs){
		System.out.println(s);
	}
	
  }
}