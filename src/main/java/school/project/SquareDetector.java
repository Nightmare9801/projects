package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The SquareDetector class prompts the user to enter the length and breadth of a shape and determines
 * if it is a square or not.
 */
class SquareDetector{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the input
            pw.println("Pls enter the length and breadth or type End to exit.");
            String input= "";
            try{
                input+= br.readLine();
            }catch(IOException e){
                pw.println(e);
            }
            //Exit Mechanism
            if(input.equalsIgnoreCase("End")){
                break;
            }
            //Transform String input to Integer type.
            String[] traninput= input.split(",");
            int len= Integer.parseInt(traninput[0].replaceAll("\\s", ""));
            int bre= Integer.parseInt(traninput[1].replaceAll("\\s", ""));
            //Check whether it isa square or not.
            if(len==bre){
                pw.println("It is a square.");
            }else{
                pw.println("It is not a square");
            }
        }
    }
}