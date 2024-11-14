package files;

//All the details of people in a residence like residence name , house number, family members names, job etc are stored in a file. Read from the file and list all the students who are graduating coming this year.
// Also list the count of boys and girl students seperately
//name,housenum,age,sex,job,year of graduation(seperated by commas in file)

import java.util.*;
import java.io.*;
public class Residence {
    public static void main(String[] args) {
        BufferedReader brr=null;

        try{
            brr=new BufferedReader(new FileReader("residence.txt"));
            String s;
            String arr[];
            String names[];
            String slist="";
            int cg=0,cb=0;
            while((s=brr.readLine())!=null){
                arr=s.split(",");
                if(arr[5].compareTo("2025")==0){ //or use .equals()
                    slist+=arr[0]+'\t';
                }
                if(arr[4].equals("student")){
                    if(arr[3].equals("male")){
                        cb++;
                    }
                    if(arr[3].equals("female")){
                        cg++;
                    }
                }

            }
            String list[]=slist.split("\t");
            for(String name :list){
                System.out.println(name);
            }
            System.out.println(cb+"\t"+cg);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            try{
            if(brr!=null){
                brr.close();
            }}
            catch(IOException e){
                System.out.println("error closing file"+e);
            }
        }
    
    }
}
