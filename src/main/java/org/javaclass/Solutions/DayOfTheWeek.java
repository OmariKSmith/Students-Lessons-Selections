package org.javaclass.Solutions;

//!                             Create a method named 'displayDay' that accepts a char 'day' as a parameter,
//!                             then outputs the day of the week based on the value of 'day'.
//!
//!                             'S' = Sunday 'M'= Monday, 'T' = Tuesday, 'W' = Wednesday, 't' = Thursday,
//!                             'F' = Friday, 's' = Saturday
//!
//!                             Output day to console.

public class DayOfTheWeek {

    public static void main(String[] args) {
        DayOfTheWeek obj = new DayOfTheWeek();
        obj.displayDay('T');
    }

    void displayDay(char day){
        switch (day){
            case 'S':
                System.out.println("Sunday");
                break;
            case 'M':
                System.out.println("Monday");
                break;
            case 'T':
                System.out.println("Tuesday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 't':
                System.out.println("Thursday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 's':
                System.out.println("Saturday");
                break;
            default:
                System.out.println("not a day");
        }
    }
}
