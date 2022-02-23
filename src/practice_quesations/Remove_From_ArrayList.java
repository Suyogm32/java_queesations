package practice_quesations;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_From_ArrayList {
	 public static void main(String[] args) {  
	      // creating an ArrayList having default size 5  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the initial size of an arraylist:-");
		 int n=sc.nextInt();
	      ArrayList<String> arr = new ArrayList<String>(n); 
	      for(int i=0;i<n;i++) {
	    	  String str=sc.next();
	    	  arr.add(str);  
	      } 
	      System.out.println("The list of the size is: " +n);  
	      // Showing all the elements in the ArrayList  
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }    
	      // Removing element available at position 1  
	      arr.remove(1);  
	      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
	      // Showing all the elements in the ArrayList  
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }  
	   }  
}
