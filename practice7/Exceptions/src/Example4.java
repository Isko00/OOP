package Exceptions.src;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
       double leftOperand, result, rightOperand;
       String leftString, operator, rightString;
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);
       Vector<String> operations = new Vector<String>();

       tokenizer = new StringTokenizer(in.nextLine(), " ");
       
       in.close();
       while (tokenizer.hasMoreTokens()) {
    	   	operations.add(tokenizer.nextToken());
       }

       for (String s : operations) {
	       tokenizer = new StringTokenizer(s, "+-*/", true);
	
	       try {
	          leftString = tokenizer.nextToken();
	          operator = tokenizer.nextToken();
	          rightString = tokenizer.nextToken();
	
	          leftOperand = Double.parseDouble(leftString);
	          rightOperand = Double.parseDouble(rightString);
	
	          if (operator.equals("+")) {
	        	  result = leftOperand + rightOperand;
	          } else if (operator.equals("-")) {
	              result = leftOperand - rightOperand;
	          } else if (operator.equals("*")) {
	              result = leftOperand * rightOperand;
	          } else if (operator.equals("/")) {
	        	  try {
	        		  result = leftOperand / rightOperand;
	        	  } catch (ArithmeticException ae) {
						System.out.println("Divide by 0.");
						ae.printStackTrace();
			             result = 0.0;
	        	  }
	          } else {
	             result = 0.0;
	          }
	
	          System.out.println("Result: " + result);
	       } catch (NoSuchElementException nsee) {
	          System.out.println("Invalid syntax");
	       } catch (NumberFormatException nfe) {
	          System.out.println("One or more operands is not a number");
	       }
       }
    }
}
