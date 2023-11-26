package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The LeapYearChecker class prompts the user to enter a year and determines whether it is a leap year
 * or not.
 */
class LeapYearChecker{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the input
            pw.println("Pls enter the year or type End to exit.");
            //Get the input
            String raw= "";
            try{
                raw+= br.readLine();
            }catch(IOException e){
                pw.println(e);
            }
            if(raw.equalsIgnoreCase("End")){
                break;
            }
            //Convert the String input to Integer type
            int year= Integer.parseInt(raw.replaceAll("\\s",""));
            //Print if it is a leap year or not.
            if(year%100==0){
                if(year%400==0){
                    pw.println("It is a leap year.");
                }else{
                    pw.println("It is not a leap year.");
                }
            }else if(year%4==0){
                pw.println("It is a leap year");
            }else{
                pw.println("It is not a leap year.");
            }
            
        }
    }
}