package listprogram;                                                                                                       
import java.util.*;                                                                                                        
public class Mobile{                                                                                                       
public static void main(String args[]){                                                                                    
 //Create a List                                                                                                           
 List<String> list=new ArrayList<String>();                                                                                
 //Add elements in the List                                                                                                
                                                                                                                           
                                                                                                                           
 list.add("Web Automation");                                                                                               
 list.add("API Automation");                                                                                               
 list.add("Mobile Automation");                                                                                            
                                                                                                                           
                                                                                                                           
 //iterating for loop to print the element in the list                                                                     
if(list.contains("Mobile "))                                                                                               
{                                                                                                                          
     System.out.println("True");                                                                                                                      
                                                                                                                           
}                                                                                                                          
else    
{
	System.out.println("False");
}
}
}