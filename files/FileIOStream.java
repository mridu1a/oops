package files;

import java.io.IOException;
import java.io.*;
import java.util.*;


public class FileIOStream {
    public static void main(String[] args) throws IOException  {
        FileInputStream fin=null;
        FileOutputStream fout=null;

        try{
        
            fout=new FileOutputStream("fileforinput.txt",true);

            Scanner sc=new Scanner(System.in);
            System.out.println("enter lines of text,press enter on empy line to stop:");
            while(true){
                String line=sc.nextLine();
                if(line.isEmpty()){
                    break;
                }
               // for(int i=0;i<line.length();i++){
                 //   fout.write(line.charAt(i));
                //}
                fout.write(line.getBytes());
                fout.write('\n');

            }

            sc.close();

        }
        catch(IOException e){
            System.out.println("erroe"+e.getMessage());
        }

        try{
            fin=new FileInputStream("fileforinput.txt");
            int ch=0;
            int countchar=0,countwords=0,countlines=0;
            do{
                ch=fin.read();
                if(ch!=-1){
                countchar++;
                if(ch=='\s'|| ch==','||ch=='.'){
                    countwords++;
                }
                if(ch=='\n'){
                    countlines++;
                }
            }
            System.out.println((char)ch);
            }while(ch!=-1);

            System.out.println("number of characters="+countchar);
            System.out.println("number of words="+countwords);
            System.out.println("number of lines="+countlines);
        }
        catch(FileNotFoundException e ){
            System.out.println("erroe"+e.getMessage());
        }
        catch(IOException e){
            System.out.println("erroe"+e.getMessage());

    }
    finally{
        if(fin!=null){
            fin.close();
        }
        if(fout!=null){
            fout.close();
        }
        System.out.println("file closed");
    }
    
}
}
