package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The SumAverageFinder class prompts the user to enter a list of numbers, calculates the sum and
 * average of the numbers, and displays the results.
 */
class SumAverageFinder{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the input
            pw.println("Pls enter the numbers or type End to exit.");
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
            //Transform the String input to Integer type
            String[] traninput= raw.split(",");
            int[] num= new int[traninput.length];
            for(int i=0; i<num.length; i++){
                num[i]= Integer.parseInt(traninput[i].replaceAll("\\s", ""));
            }
            //Findthe Sum and Average
            int sum=0;
            double avg=0;
            for(int i=0; i<num.length; i++){
                sum+= num[i];
                avg+= num[i];
            }
            avg/=num.length;
            //Print the Sum and Average
            pw.println("The sum is: "+ sum);
            pw.println("The average is: "+avg);
        }
    }
}