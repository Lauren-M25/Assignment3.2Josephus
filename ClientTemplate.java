/********************************************************************
 * Programmer: Lauren
 * Class:  CS40S
 *
 * Assignment: A3.1 Josephus
 *
 * Description: solves the Josephus problem using queue.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class ClientTemplate {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;       // string data input from keyboard
        String strout;      // processed info string to be output
        String bannerOut;   // string to print banner to message dialogs

        String prompt;      // prompt for use in input dialogs

        String delim = "[ ]+"; // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
    // ***** create objects *******
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        BufferedReader fin = new BufferedReader(new FileReader("JosephusData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
            
    // ************************ get input **********************

        strin = fin.readLine();
    
    // ************************ processing ***************************
        while(strin != null){
        
            tokens = strin.split(delim);
        
            int m = Integer.parseInt(tokens[0]);
            int participants = Integer.parseInt(tokens[1]);
        
            Queue jQueue = new Queue();
            Node n = new Node(0);
        
            for(int i = 1; i <= participants; i++){
                n = new Node(i);
                jQueue.enqueue(n);
            }
        
            int counter = 0;
            
            String elimInfo = (participants + " participants, every " + m + "th person eliminated");
            String elimOrder = "Elimination order: ";
        
            while(jQueue.isEmpty() == false){
                counter++;
                if(counter % m == 0){
                    elimOrder += (jQueue.dequeue() + " ");
                } else {
                    n = new Node(jQueue.dequeue());
                    jQueue.enqueue(n);
                }
            }
        
            System.out.println(elimInfo);
            System.out.println(elimOrder);
            
            strin = fin.readLine();
        }

    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
