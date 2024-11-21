import java.util.Scanner;
 
   public class IT24102356Lab5Q1{
   
     public static void main (String[] args){
  
int number1,number2,number3;
  Scanner input = new Scanner(System.in);

 System.out.println("Enter the first interger:");
  number1 = input.nextInt();

 System.out.println("Enter the second interger:");
  number2 = input.nextInt();

 System.out.println("Enter the third integer:");
  number3 = input.nextInt();
 
  System.out.println("user entered numbers are:" +number1+" , "+ number2 +" ,"+ number3); 

int smallest;
  if (number1 <= number2 && number1 <= number2){
	 smallest = number1;

	 } else if (number2 <= number1 && number2 <= number3){
		 smallest = number2;
	 } else {smallest = number3;
	    }
int largest;		
  if (number1 >= number2 && number1 >= number2){
	largest = number1;

	 } else if (number2 >= number1 && number2 >= number3){
		 largest = number2;
	 } else {largest = number3;
	    }
System.out.println("the smallest number is: " + smallest);
System.out.println("the largest number is: "+ largest);

   }
   }