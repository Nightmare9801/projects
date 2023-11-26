package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The Greater class takes two numbers as input and prints the greater of the two numbers.
 */
class Greater{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the input
            pw.println("Pls enter the two numbers or type End to exit");
            //Input variable
            String raw= "";
            try{
                //Get the input
                raw+= br.readLine();
            }catch(IOException e){
                //Catches the IO exception if thrown
                pw.println(e);
            }
            //Exit Mechanism
            if(raw.equalsIgnoreCase("End")){
                break;
            }
            //Transform the String to Integer type
            String[] transstring= raw.split(",");
            int no1= Integer.parseInt(transstring[0].replaceAll("\\s",""));
            int no2= Integer.parseInt(transstring[1].replaceAll("\\s",""));
            //Find the Greater Number
            if(no1<no2){
                pw.println(no2);
            }else if(no1>no2){
                pw.println(no1);
            }else{
                pw.println(no1);
            }
        }
    }
}