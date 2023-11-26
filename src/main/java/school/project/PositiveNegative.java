package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class PositiveNegative{
    public static void main(String[] args){
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to enter the input
            pw.println("Pls enter the number or type End to exit.");
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
            //Convert theString input to Integer type
            int num= Integer.parseInt(raw.replaceAll("\\s",""));
            if(num==0){
                pw.println("It is equal to zero.");
            }else if(num<0){
                pw.println("It is a negative number.");
            }else{
                pw.println("It is a positive number.");
            }
        }
    }
}