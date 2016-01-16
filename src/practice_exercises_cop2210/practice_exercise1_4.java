package practice_exercises_cop2210;

/*
 * You are now an entrant to the show. Get ready, it's about to begin!
 * And welcome to the show!!
 */

/**
 *
 * @author Carlos
 */
public class practice_exercise1_4 {
    public static void main (String[] args)
    {
        /*This program will calculate and output the annual balance for an account 
	* with an initial balance of $1,000.00 and an APR of 5%, through 3 years.
	*/
        
        // All relevant variables that will be used in calculations
		
        int initial_balance = 1000;
	int annual_interest = 5;
	int interest_year_1 = initial_balance * annual_interest/100;
        int first_year_total = initial_balance + interest_year_1;
		
	int interest_year_2 = first_year_total * annual_interest/100; 
        int second_year_total = first_year_total + interest_year_2;
        
	int interest_year_3 = second_year_total * annual_interest/100; 
        int third_year_total = second_year_total + interest_year_3;
        	
	// Output to be seen by user: 
		
	System.out.println("Total after first year: " + first_year_total); 
	System.out.println("");
	System.out.println("Total after second year: " + second_year_total);
	System.out.println("");
	System.out.println("Total after third year: " + third_year_total); 
		
	//This is the end        
    }
}
