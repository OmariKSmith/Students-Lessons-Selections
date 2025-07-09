package org.javaclass.Solutions;

import javax.swing.*;
import java.util.Random;

public class GuessNumberOneTry {
    public static void main(String[] args) {
        // generate random integer as answer
        int answer = new Random().nextInt(10);

        // show window to capture user input
        String guess = JOptionPane.showInputDialog("Guess number0 through 10");

        // check guess, then show window to display if guess is correct
        if(Integer.parseInt(guess) == answer){
            JOptionPane.showMessageDialog(null," Correct! the number  is " + guess);
        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry the answer was " + answer);
        }
    }
}
