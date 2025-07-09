package org.javaclass;

public class _04ElseIf {

    public static void main(String[] args) {

        //-                          THE ELSE-IF SELECTION STATEMENT

//`     KEYWORD     SENTINEL VALUE       BODY
        if          (65 < 32)           {

        }
        else if     (64 < 32)           {

        }
        else                            {

        }

//      When the 'if' sentinel value is false, flow control goes to the 'else if' block

//`     The 'else if' keyword has a sentinel value that works the same as the first if

//      The 'else'  code body is executed when the 'else if' sentinel value is false.




//-                                    CHECK POINT




//     Evaluate 'sentinel value'    then choose flow
        if (55 > 52) {
            //FLOW 1
        } else if (55 < 51) {
            //`FLOW 2
        } else {
            // FLOW 3
        }




//`    Evaluate 'sentinel value'    then choose flow
        if (32 < 52) {
            //FLOW 1
        } else if (55 > 52) {
            //`FLOW 2
        } else {
            // FLOW 3
        }




//     Evaluate 'sentinel value'    then choose flow
        if (10 > 22) {
            //FLOW 1
        } else if (55 < 52) {
            //`FLOW 2
        } else if (55 < 520) {
            // FLOW 3
        } else {
            //` FLOW 4
        }




//`    Evaluate 'sentinel value'    then choose flow
        if (52 < 52) {
            //FLOW 1
        } else if (55 >= 52) {
            //`FLOW 2
        } else {
            // FLOW 3
        }




//     Evaluate 'sentinel value'    then choose flow
        if (52 <= 51) {
            //FLOW 1
        } else if (55 < 52) {
            //`FLOW 2
        } else if (550 <= 52) {
            // FLOW 3
        } else if (55 >= 52) {
            //`FLOW 4
        } else {
            // FLOW 5
        }

    }
}
