package sem2;

import java.util.Scanner;
import java.util.Stack;

public class infix_to_prefix_and_postfix {
	
	 public static String printPostFix(String str){
	        Stack stack = new Stack();
	        String postfix = "";
	        for(int i=0;i<str.length();i++){
	            char c = str.charAt(i);
	            if(Character.isLetter(c)){
	                postfix = postfix + c;
	            }
	            else if(c == '('){
	                continue;
	            }
	            else if(c == ')'){
	                postfix = postfix + ((Character)stack.pop()).toString();
	            }
	            else{
	                stack.push(c);
	            }
	        }
	        return postfix;
	 
	    }
	 
	    public static String printPreFix(String str){
	        Stack stack = new Stack();
	        String prefix = "";
	        for(int i=str.length()-1;i>=0;i--){
	            char c = str.charAt(i);
	            if(Character.isLetter(c)){
	                prefix = ((Character)c).toString() + prefix;
	            }
	            else if(c == '('){
	                prefix = ((Character)stack.pop()).toString() + prefix;
	            }
	            else if(c == ')'){
	                continue;
	            }
	            else{
	                stack.push(c);
	            }
	        }
	        return prefix;
	 
	    }

	 public static void main(String args[]){
		 Scanner s=new Scanner(System.in);
		 System.out.println("WRITE THE EXPRESSION");
	        String infix = "((a+b)*(z+x))";
	        System.out.println("((a+b)*(z+x))");
	        System.out.println();
	        System.out.println("Postfix : " + printPostFix(infix));
	        System.out.println("Prefix : " + printPreFix(infix));
	 
	    }
	 
}
