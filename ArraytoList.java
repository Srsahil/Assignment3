package listprogram;

import java.util.ArrayList;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		
		
		// storing values in array
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		//creating a list
		List<Integer> list=new ArrayList<>();
		// inserting array into list
		for(int i=0;i<array.length;i++)
		{
			list.add(array[i]);
		}
		//printing list after conversion into array
		System.out.println(list);

	}

}
