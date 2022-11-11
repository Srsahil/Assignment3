package listprogram;
import java.util.*;  
public class Sum{  
public static void main(String args[]){  
 //Create a List and element  
	List<Integer> list=Arrays.asList(100,200,300,400,500,600,700,10,90000);
 int sum=0;
 

 
 //iterating for loop to print the element in the list
 
 for(int i=0;i<list.size();i++)
 {
	 sum+=list.get(i);
 }
 // printing sum of all
 System.out.println("sum of the list number is ->" + sum);

  
}  
} 