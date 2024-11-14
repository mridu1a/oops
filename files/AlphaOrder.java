package files;
import java.util.*;
import java.io.*;
import java.lang.*;

//Write a Java program to read a text file, sort its contents alphabetically, and write the sorted contents to a new file.
//Handle exceptionsUse a finally block to close a file after reading.
public class AlphaOrder {
    public static void main(String[] args) {
        try(BufferedReader b= new BufferedReader(new FileReader("fileforinput.txt"));){
            String s,content="";

            while((s=b.readLine())!=null){
                content+=s+' ';
            }
            

            String [] arr=content.split(" ");
            int n=arr.length;

            for(int i=0;i<n;i++){
                for(int j=0;j<n-1-i;j++){
                    if((arr[j].compareToIgnoreCase(arr[j+1]))>0){
                        String temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            try(BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));){
                for(String w:arr){
                    bw.write(w+" ");
                }
            }
            try(BufferedReader br= new BufferedReader(new FileReader("output.txt"));){
                String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            }



        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}
