
/*
 Name: Omar Iftikhar
 Student ID: T00760842
 Course Number: COMP 1130
 Assignment Number: 2
 */

import java.util.Scanner;

public class Iftikhar
{
    //I have declared constants
    private static final int s_to_m = 60;
    private static final int m_to_h = 60;
    private static final int s_to_h = s_to_m * m_to_h;
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Taking in input from the user
        System.out.println("Please Enter a Time Duration in Hour, Minute and Second :");
        
        //User inputs the hour
        System.out.print("Enter the Number of Hours: ");
        long hours = scanner.nextLong();
        
        //User inputs the minutes
        System.out.print("Enter the Number of Minutes: ");
        long minutes = scanner.nextLong();
        
        //User inputs the seconds
        System.out.print("Enter the Number of Seconds: ");
        long seconds = scanner.nextLong();
        
        //converting the hours,minutes and seconds to total seconds
        long TotalSeconds = (hours * s_to_h)+(minutes * m_to_h)+seconds;
        
        //Giving the output to the user
        System.out.println("The given time in seconds is " + TotalSeconds + " Seconds.\n");
        
        //Taking input from the user to convert total seconds to a Time duration
        System.out.println("Please Enter a Time Duration in Total Number in Seconds:");
        long TimeDuration = scanner.nextLong();
        
        //converting seconds to hours,minutes and seconds individually
        long NewHour = (TimeDuration / 3600);
        long NewMinutes = ((TimeDuration % 3600) / 60);
        long NewSeconds = ((TimeDuration % 3600) % 60);
        
        //Giving the user the output in Hours, Minutes and Seconds
        System.out.println("The given in Hour,Minutes and Second is: " + NewHour + " Hours " + NewMinutes + " Minutes " + NewSeconds + " Seconds");
        
        
    }
}
