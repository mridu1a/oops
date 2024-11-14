package Threads;

import java.util.*;
//Write a Java program that creates two threads:
//First thread : reads 16 integers from the user, stores them in 5 by 4 matrix, the last row of the matrix should contain the sums of the columns  calculated by your program. Then the whole matrix is printed.
//Second thread:randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the first row and column with the most 1’s.
//Also show thread synchronization
class ThreadForMat extends Thread{

   public void  run(){
            Scanner sc=new Scanner(System.in);
            int[][] mat1=new int[5][4];
            System.out.println("enter matrix 4X4:");
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    mat1[i][j]=sc.nextInt();
                }
            }
            sc.close();
            int sum=0;
            for(int i=0;i<4;i++){
                sum=0;
                for(int j=0;j<4;j++){

                    sum+=mat1[j][i];
                }
                mat1[4][i]=sum;
            }

            //print matrix
            for(int i=0;i<5;i++){
                for(int j=0;j<4;j++){
                    System.out.print(mat1[i][j]+"\t");
                }
                System.out.println();
            }
            
    }
}
class RandomGenThread extends Thread{
    public void run(){
        Random rnd=new Random();
        int[][] mat2=new int[4][4];
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                mat2[i][j]=rnd.nextInt(2);
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(mat2[i][j]+"\t");
            }
            System.out.println();
        }
        int i,j,countr=0,countc=0,maxr=0,maxc=0,c=0,r=0;
            for(i=0;i<4;i++){
                countr=0;
                for(j=0;j<4;j++){
                    
                    if(mat2[i][j]==1){
                        countr++;
                    }
                }
                if (countr>maxr){maxr=countr;
                                    r=i+1;}
            }
            
            for(j=0;j<4;j++){
                countc=0;
                for(i=0;i<4;i++){
                    
                    if(mat2[i][j]==1){
                        countc++;
                    }
                }
                if (countc>maxc){maxc=countc;
                                c=j+1;}
            }
            System.out.println("row and column with most 1's:"+r+"\t"+c);

    }


}
public class MatrixGen {
    public static void main(String[] args) {
        ThreadForMat t1=new ThreadForMat();
        t1.start();
        RandomGenThread t2=new RandomGenThread();
        /*try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t2.start();
    }

}
