package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The OldYoung class prompts the user to enter three ages, calculates the oldest and youngest age, and
 * repeats the process until the user types "End".
 */
class OldYoung{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the ages
            pw.println("Pls enter the ages or type End to exit.");
            String raw= "";
            try{
                raw+= br.readLine();
            }catch(IOException e){
                pw.println(e);
            }
            //Exit Mechanism
            if(raw.equalsIgnoreCase("End")){
                break;
            }
            //Convert String input to Integer type
            String[] transinput= raw.split(",");
            int firage= Integer.parseInt(transinput[0].replaceAll("\\s",""));
            int secage= Integer.parseInt(transinput[1].replaceAll("\\s",""));
            int thiage= Integer.parseInt(transinput[2].replaceAll("\\s",""));
            //Print the oldest and youngest age
            pw.println("The oldest age is:"+Math.max(firage, Math.max(secage, thiage)));
            pw.println("The youngest age is: "+ Math.min(firage, Math.min(secage,thiage)));
        }
    }
}