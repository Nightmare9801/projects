package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The Bonus class prompts the user to enter their salary and years of service, and then calculates and
 * displays the increased salary if the years of service is greater than 5.
 */
class Bonus{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter his/her salary and the number of years he/she worked at the company 
            pw.println("Pls enter the salary and the number of years or type End to exit.");
            //Get the input
            String raw="";
            try{
                raw+= br.readLine();
            }catch(IOException e){
                pw.println(e);
            }
            //Exit Mechanism
            if(raw.equalsIgnoreCase("End")){
                break;
            }
            //Change the raw String input to Integer type
            String[] data= raw.split(",");
            int salary= Integer.parseInt(data[0].replaceAll("\\s", ""));
            int yrofservice= Integer.parseInt(data[1].replaceAll("\\s", ""));
            if(5<yrofservice){
                pw.println("The increased salary is: Rs."+ (salary+(salary*5/100)));
            }else{
                pw.println("You are not eligible for salary increment");
            }
        }
    }
}