package org.javaclass;

public class _05Switch {

    public static void main(String[] args) {
       int intVariable = 2;


//-                                     THE SWITCH SELECTION STATEMENT



//`     KEYWORD         SENTINEL VALUE       BODY
        switch          (intVariable)       {

            case 0:
                System.out.println("1000");
                break;
            case 1:
                System.out.println("2000");
                break;
            case 2:
                System.out.println("4000");
                break;
            default:
                System.out.println("8000");
        }


//      When the keyword 'switch' marks the start of the statement

//`     The sentinel value of a switch statement uses a single int, char, or String value

//      The keyword 'case' is where the sentinel value is checked for an equal condition

//`     If intVariable value equals case value execute the code block following case declaration






//-                                    CHECK POINT




//     Evaluate 'sentinel value'    then match case flow

        char grade = 'a';
        switch (grade) {

            case 'a':
                System.out.println("100");
                break;
            case 'b':
                System.out.println("90");
                break;
            case 'c':
                System.out.println("80");
                break;
            default:
                System.out.println("Try again");
        }



//`     Evaluate 'sentinel value'    then match case flow

        grade = 'a';
        switch (grade) {

            case 'a':
                System.out.println("100");
                break;
            case 'b':
                System.out.println("90");
                break;
            case 'c':
                System.out.println("80");
                break;
            default:
                System.out.println("Try again");
        }




        //     Evaluate 'sentinel value'    then match case flow

        String userName = "Janet";
        switch (userName) {

            case "Michael":
                System.out.println("Hello Michael");
                break;
            case "Janet":
                System.out.println("Hello Janet");
                break;
            case "Mark":
                System.out.println("Hello Mark");
                break;
            default:
                System.out.println("User Not Found");
        }

    }
}
