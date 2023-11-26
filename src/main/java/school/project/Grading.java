package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The Grading class prompts the user to enter marks and then prints the corresponding grade based on
 * the marks entered.
 */
class Grading{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the marks
            pw.println("Pls enter the marks or type End to exit.");
            //Get the input
            String raw= "";
            try{
                //Get the input
                raw+= br.readLine();
            }catch(IOException e){
                pw.println(e);
            }
            //Exit mechanism
            if(raw.equalsIgnoreCase("End")){
                break;
            }
            //Convert raw String input to Integer type
            int marks= Integer.parseInt(raw);
            //Print the Grade
            if(marks<25){
                pw.println("You got a F.");
            }else if(marks<45){
                pw.println("You got an E.");
            }else if(marks<50){
                pw.println("You got a D");
            }else if(marks<60){
                pw.println("You got a C");
            }else if(marks<80){
                pw.println("You got a B.");
            }else{
                pw.println("You got an A");
            }
        }
    }
}