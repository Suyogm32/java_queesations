package practice_quesations;

import java.util.Scanner;

public class String_Reverse {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String blogName =sc.next();
	    String reversedString = "";
	    
	    for(int i = blogName.length()-1; i>=0; i--){
	      reversedString = reversedString + blogName.charAt(i);
	    }
	    
	    System.out.print("The reversed string of the '"+blogName+"' is: " );
	    System.out.println(reversedString);
	  }
}
