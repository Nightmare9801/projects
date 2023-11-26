package school.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * The Discount class calculates the total cost of an item based on the quantity and applies a discount
 * if the cost exceeds a certain threshold.
 */
class Discount{
    public static void main(String[] args){
        //Initialize the fundamental parameters
        int cost= 100;
        int discount= 10;
        //Create the instances of the I/O class
        PrintWriter pw= new PrintWriter(System.out, true);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            //Prompt the user to input the qty.
            pw.println("Pls enter the quantity or type End to exit");
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
            //Convert the String input to Integer type
            int qty= Integer.parseInt(raw);
            int costwithoutdiscount= qty*cost;
            //Print the cost
            if(costwithoutdiscount<1000){
                pw.println("The total cost is: Rs. "+ costwithoutdiscount);
            }else{
                int costwithdisc= costwithoutdiscount-(costwithoutdiscount*discount/100);
                pw.println("The total cost is: Rs. "+costwithdisc);
            }
        }
    }
}