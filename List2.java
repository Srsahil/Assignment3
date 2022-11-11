package listprogram;
import java.util.*;  
public class List2{  
public static void main(String args[]){  
 //Create a List  
 List<Integer> list=new ArrayList<Integer>();  
 //Add elements in the List  
 
 list.add(100);
 list.add(200);
 list.add(300);
 list.add(400);
 list.add(500);
 list.add(600);
 
 //iterating for loop to print the element in the list
 
 for(Integer i:list)
 {
	 System.out.println(i);
 }

  
}  
} 