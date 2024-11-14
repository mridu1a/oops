package files;
import java.io.*;

//Write a Java program that reads a file and displays the file on the screen, with a line number before each line.
public class FileRead {
    public static void main(String[] args) throws IOException{
        try(BufferedReader bfr=new BufferedReader(new FileReader("readthis.txt"));){
            String line;
            int i=1;
            while((line=bfr.readLine())!=null){
                System.out.println(i+" "+line);
                i++;
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
