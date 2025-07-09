package org.javaclass;

public class LogicalOperators {
//-                                                         Logical Operators
//-
//`                             Logical operators are used to make compound boolean expressions.

//`                             There are four logical operators in Java:

//`                             AND                 &
//`                             OR                  |
//`                             NOT                 !
//`                             EXCLUSIVE OR        ^


}

 class App1{
     public static void main(String[] args) {
         int a = 10, b = 20;

         if (a < b & b < 30) {
             System.out.println("Both conditions are true");
         }

         if (a > b | b == 20) {
             System.out.println("At least one condition is true");
         }

         if (!(a == b)) {
             System.out.println("a is not equal to b");
         }

         if(a>b ^ b==21){
             System.out.println("Both conditions are false so sentinel value is false");
         }

         if(a<b ^ b==32){
             System.out.println("Both conditions are true so sentinel value is false");
         }

         if(a>b ^ b==20){
             System.out.println("One  condition is true so sentinel value is true");
         }

         if(b==20 ^ a>b){
             System.out.println("One  condition is false so sentinel value is true");
         }





//-                                         *CHECK POINT*


//     Evaluate 'sentinel value' true or false?
         if (55 > 52 & 75 < 33 ) {
             System.out.println();
         }


//`    Evaluate 'sentinel value' true or false?
         if (72 > 52 | 22 > 44) {
             System.out.println();
         }


//     Evaluate 'sentinel value' true or false?
         if (!(10 < 22)) {
             System.out.println();
         }

 //-                                    Short-Circuit Behaviour

 //`                       Both the AND / OR operators have what is called a 'short-circuit' version:

//`                             AND                 &&
//`                             OR                  ||

//`                        The short-circuit version of both operators is simply two of the symbols.

//`                        Short- circuit OR operator tell Java to ignore the second evaluation if
//`                        the first boolean expression is TRUE. This helps with efficiency.

//`                        Short- circuit AND operator tell Java to ignore the second evaluation if
//`                        the first boolean expression is FALSE. This helps with efficiency.

//`                        The Short-circuit versions of AND / OR are most often used in modern
//`                        Java programs.



//-                                         *CHECK POINT*



//`    Evaluate 'sentinel value' true or false?
         if (52 == 52 || 45 < 30) {
             System.out.println();
         }


//     Evaluate 'sentinel value' true or false?
         if (52 < 52 && 30 > 21) {
             System.out.println();
         }

//`    Evaluate 'sentinel value' true or false?
         if (((52 < 52) && (30 > 21)) || (75 > 35)) {
             System.out.println();
         }
     }



 }





