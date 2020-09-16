import java.util.Scanner;
/**
 * pizza
 * @author jason
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for input
    System.out.println("What is the size of the pizza (in cm):");

    //user input
    int number = input.nextInt();
    
    //prices
    double ingredients = (number * 0.5);
    double labor = (0.75);
    double power = (0.99);
    double subtotal = (ingredients+labor+power);
    double taxes = (subtotal * .13);
    double total = ( subtotal + taxes);
   
   // the total prices 
  System.out.println("Subtotal:" + "$"+ subtotal);
  System.out.println("Taxes:" + "$" + taxes);
  System.out.println("Total:" + "$" + total);
   
   
   
   // if statments 
    if (number <= 20){
       System.out.println("We are going to make you a cute little pizza!");
    }
    else if (number <= 40){
      System.out.println("This will be delicious!");
    }
    else if (number >= 40){
      System.out.println("Whoa, big pizza!You might need a truck to get this home!");
    }

  }
}
