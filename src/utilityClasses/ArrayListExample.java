package utilityClasses;

import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String args[]){
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>(); 

	arrayList.add( new Integer(1) ); 
	arrayList.add( new Integer(2) );
	arrayList.add( new Integer(3) );

	System.out.println("ArrayList contains " + arrayList.size() + " key value pair.");  
 
	System.out.println("Converting ArrayList to Object array");

	Object[] elements = arrayList.toArray();
	for(int i=0; i < elements.length ; i++)
	       System.out.println(elements[i]);
	}
}