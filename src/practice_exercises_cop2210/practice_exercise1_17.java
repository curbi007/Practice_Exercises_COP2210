/*
 * You are now an entrant to the show. Get ready, it's about to begin!
 * And welcome to the show!!
 */
package practice_exercises_cop2210;

import javax.swing.JOptionPane;
import java.net.URL; 
import javax.swing.ImageIcon; 

/**
 *
 * @author Carlos
 * 
 */
public class practice_exercise1_17 {
   public static void main(String[] args) throws Exception
   {
       //this program 
       
       URL imageLocation = new URL ("http://i3.kym-cdn.com/photos/images/newsfeed/001/037/049/75d.png");
       JOptionPane.showMessageDialog(null, "Hello", "Urgent Message!!!",
       JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
       
       //la fin. 
   }
}
