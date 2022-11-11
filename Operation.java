package listprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		
		 //Create a List  
		 List<Integer> list=new ArrayList<Integer>();  
		 //Add elements in the List  
		 
		 list.add(33);
		 list.add(44);
		 list.add(55);
		 list.add(66);
		 list.add(77);
		 list.add(88);
		 //list before any operation
		 System.out.println(list);
		 //removing second element 
		 
		int a= list.remove(1);
		//removed element
		
		System.out.println("removed element is "+a);
		//list after removal of second element using index  
		System.out.println(list);
		//removing second element using value
		list.remove(Integer.valueOf(55));
		
		// list after removal of second element
		System.out.println(list);
		
		//adding 90 at index 3
	list.add(3, 90);
	//list after adding 90 at 3 index 
	System.out.println(list);
	// length of the list
	System.out.println("length of list is ->" +list.size());
	
	//printing value using loop
	 for (Iterator<Integer> i = list.iterator(); i.hasNext(); ) 
	     System.out.println(i.next());
	 // converting list into array
	 int length1 = list.size();
	 int [] array = new int[length1];
	 for(int i=0;i<list.size();i++)
	 {
		 array[i]=list.get(i);
	 }
	 System.out.println("printing the array ");
	 // printing the array
	 for(int i=0;i<array.length;i++)
	 {
		 System.out.println(array[i]);
	 }
	
	
	
	
	
		

	}

}
