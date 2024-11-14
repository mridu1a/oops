package files;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class BuffReader {

    public static void main(String[] args) {
        try(BufferedWriter bfr=new BufferedWriter(new FileWriter("fileforinput.txt",true));){
            Scanner sc=new Scanner(System.in);
            String line;
            System.out.println("enter lines of text,press enter on emprty line to finish:");
            while((line=sc.nextLine())!=null){
                if(line.isEmpty()){
                    break;
                }
                bfr.write(line);
                bfr.write("\n");

            }
            sc.close();
        }
        catch(FileNotFoundException e ){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    int lines=0,charCount=0,wordCount=0;
        try(BufferedReader bfr=new BufferedReader(new FileReader("fileforinput.txt"));){
            String line;
            while((line=bfr.readLine())!=null){
                System.out.println(line);
                charCount+=line.length();
                wordCount+=line.split(" ").length;
                lines++;
            }
            System.out.println("lines="+lines);
            System.out.println("charCount="+charCount);
            System.out.println("wordCount="+wordCount);
           /*  
           String arr[]=new String[lines];
            BufferedReader bffr=new BufferedReader(new FileReader("fileforinput.txt"));
            int i=0;
           
        
                while((line=bffr.readLine())!=null){
                arr[i]=line.split(",")[1];
                i++;
                //System.out.println(arr);
            }
            for(String s:arr){
                System.out.println(s);
            }*/
            //for(int i=0;i<lines;i++){
              //  System.out.println(arr[i]);
            //}
            
        }
        catch(FileNotFoundException e ){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    

    }
    
}
