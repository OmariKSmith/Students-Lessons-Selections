package org.javaclass.Solutions;

//!                             Create a method named 'grade' that accepts a double as an argument 'score',
//!                             then outputs a letter grade based on the value of 'score'.
//!
//!                             >=90 is an A, >=80 is a B, >=70 is a C, >=60 is a D, all else  = F

public class Grader {

    public static void main(String[] args) {
        Grader grader = new Grader();
        double myScore = 72;
        double yourScore = 94;

        grader.grade(myScore);
        grader.grade(yourScore);
    }

    void grade(double score){
        if(score >= 90){
            System.out.println('A');
        }
        else if (score >= 80) {
            System.out.println('B');
        }

        else if (score >= 70) {
            System.out.println('C');
        }
        else if (score >= 60) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
