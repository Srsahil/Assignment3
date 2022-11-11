package listprogram;                                                                                                                                                                 
import java.util.*;                                                                                                                                                                  
public class Mobile{                                                                                                                                                                 
public static void main(String args[]){                                                                                                                                              
 //Create a List                                                                                                                                                                     
 LinkedList<String> list=new LinkedList <String>();                                                                                                                                  
 //Add elements in the List                                                                                                                                                          
                                                                                                                                                                                     
                                                                                                                                                                                     
 list.add("Web Automation");                                                                                                                                                         
 list.add("API Automation");                                                                                                                                                         
 list.add("Mobile Automation");                                                                                                                                                      
                                                                                                                                                                                     
                                                                                                                                                                                     
 //iterating for loop to print the element in the list                                                                                                                               
        boolean res = list.stream().anyMatch((a) -> a.startsWith("Mobile"));                                                                                                         
             System.out.println("Do any string begins with letter Mobile = "+res);                                                                                                   
                                                                                                                                                                                     
                                                                                                                                                                                     
                                                                                                                                                                                     
                                                                                                                                                                                     
                                                                                                                                                                                     
                                                                                                                                                                                     
                                                                                                                                                                                     
}                                                                                                                                                                                    
}                                                                                                                                                                                    
