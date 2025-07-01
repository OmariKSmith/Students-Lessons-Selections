package org.javaclass.Solutions;

import javax.swing.*;
import java.util.Random;

public class GuessNumberOneTry {
    public static void main(String[] args) {
        int answer = new Random().nextInt(10);

        String guess = JOptionPane.showInputDialog("Guess number0 through 10");

        if(Integer.parseInt(guess) == answer){
            JOptionPane.showMessageDialog(null," Correct! the number  is " + guess);
        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry the answer was " + answer);
        }
    }
}
