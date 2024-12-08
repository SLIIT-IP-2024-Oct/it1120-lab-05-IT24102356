import java.util.Scanner;
 public class IT24102356Lab5Q2{
  public static void main(String[] args){
  
Scanner scanner  = new Scanner(System.in);
int NoOfMem;
String prize;

System.out.println("Enter the number of members introduced: ");
if (scanner.hasNextInt()) {  
NoOfMem = scanner.nextInt();

 
 if (NoOfMem >= 0){
 switch (NoOfMem){
   case 0:
       prize = "No Price";
       break;
  case 1: 
       prize = "Pen";
       break;
  case 2:
       prize = "Umbrella";
       break;
  case 3:
       prize = "Wheel Chair";
       break;
  case 4:
       prize = "Travelling Bag";
       break;
  case 5:
       prize = "Headphone";
       break;
  default:
       prize = "Invalid Scenario";
  }
    System.out.println("The prize is :" + prize);
  } else {
    System.out.println("Input must be a number >= 0. ");
  }
  } else {
    System.out.println("Invalid input.");

  }   




  }
 }
