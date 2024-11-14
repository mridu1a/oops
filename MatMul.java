import java.util.*;

public class MatMul{

    public static void main(String[] args){
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] a= new int[m][n];
        int[][] b= new int[m][n];
        int[][] c= new int[m][n];
        System.out.println("enter elements of first matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }


        System.out.println("enter elements of second matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }   
        sc.close();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }   
        }
        System.out.println("resultant matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }   
            System.out.println();
        }       


    }


}
