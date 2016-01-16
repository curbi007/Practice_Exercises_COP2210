/*
 * You are now an entrant to the show. Get ready, it's about to begin!
 * And welcome to the show!!
 */
package practice_exercises_cop2210;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 * 
 */
public class practice_exercise1_16 {
    public static void main (String[] args)
    {
        String user_input = JOptionPane.showInputDialog("What is your name?");
        System.out.println(user_input + ", eh? Well, let's disregard that for"
                + " now and call you \"Hal\".");
        
        String actual_name = "Hal"; 
        
        JOptionPane.showMessageDialog(null, " I'm sorry, " + actual_name + ". I'm afraid I can't"
                + " do that at the moment."); 
       
        //la fin. 
    }
}
