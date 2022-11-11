package listprogram;
import java.util.*;  
public class List3{  
public static void main(String args[]){  
 //Create a List  
	List<Integer> list=Arrays.asList(100,200,300,400,500,600,700,10,500,40);
   
 

 
 //iterating using iterator  for loop to print the element in the list
 for (Iterator<Integer> i = list.iterator(); i.hasNext(); ) 
     System.out.println(i.next());
 


  
}  
} 