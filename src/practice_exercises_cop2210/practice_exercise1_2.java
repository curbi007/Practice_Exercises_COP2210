/*
 * You are now an entrant to the show. Get ready, it's about to begin!
 * And welcome to the show!!
 */
package practice_exercise1;
import java.util.Scanner;

/**
 *
 * @author Carlos
 * There will be a smaller app in here that will calculate the summation of the 
 * first 10 integers, along with your input. 
 */
public class practice_exercise1_2 {
    
    public static void main (String[] args)
    {
    //This application will print the sum of the first 10 positive integers
    //Not too shabby. 
   
    int summation_of_numbers = 1+2+3+4+5+6+7+8+9+10;
    int total = summation_of_numbers; 
    
     
    //Alternatively....
    
    //System.out.print(1+2+3+4+5+6+7+8+9+10);
    
    
    /*Here, the user will be able to input a number to be added to this total.
    *This code will be commented out for now but is available to use whenever. 
    */
    
    /*
    int summation_of_numbers = 1+2+3+4+5+6+7+8+9+10;
    int user_input_value = 0; 
    
    Scanner canner = new Scanner(System.in); //takes input from user to be added
                                             //to the summation of the latter. 
    user_input_value = canner.nextInt(); 
    int total = summation_of_numbers + user_input_value;
    */

    System.out.println("Here's the total for this exercise: " + total); 
    System.out.println("I think this might be wrong, doe.");
    
    return;
}
}