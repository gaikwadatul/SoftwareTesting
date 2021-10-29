package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class collection_demo2 {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
        list.add("Apple");
        list.add("mango");
        list.add("banana");
        list.add("grapes");
        
        System.out.println("size of list: "+list.size());
        System.out.println("Element of list: "+list);
        System.out.println("print of elemnt present"+list.get(0));
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        	
        }
        System.out.println("traversing list for each loop: ");
        for(Object fruit: list) {
        	System.out.println(fruit);
        }
        System.out.println("Returning element:"+list.get(1));
        
        //changing the element 
        list.set(1, "Dates");
        System.out.println("Size of list: "+list.size());
        System.out.println("Size of list: "+list);
        
        
        Collections.sort(list);
        System.out.println("size of list "+list.size());
        System.out.println("size of list "+list);
        
        System.out.println("traversing list through for each() meyhod");
        list.forEach(a->{
        	System.out.println(a);
        });
      System.out.println("travrsing list through iterator interface");
      Iterator itr = list.iterator();
     // System.out.println(itr.hasNext());
     // System.out.println(itr.next());
     // System.out.println(itr.next());
     // System.out.println(itr.next());
     // System.out.println(itr.next());
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     System.out.println("valuse is showing true or false : "+itr.hasNext());
      
	}

}
