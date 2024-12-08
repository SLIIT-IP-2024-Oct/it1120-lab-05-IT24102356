import java.util.Scanner;

  public class IT24102356Lab5Q3 {   
   public static void main(String[] args) {
 
 Scanner scanner= new Scanner(System.in);
 int count = 0, number;
 double Sumofsquares = 0 , RootMeanSquare ; 
 System.out.println("Enter positive integer(terminate input with -99):");

 while(true) {
    System.out.println("Enter a number:");
    number = scanner.nextInt();
    if (number ==  -99 ) {
        break;
    }
    if(number < 0 ){
        System.out.println("Invalid input please input positive interger."); 
        continue; 
    }
   Sumofsquares += Math.pow(number,2);
   count++;
 }
if(count == 0) {
    System.out.println("No positive numbers were  entered.");
    } else {
        
    RootMeanSquare = Math.sqrt(Sumofsquares / count);
    System.out.println("Root Mean Square:" + RootMeanSquare);
    }
   }
  }


