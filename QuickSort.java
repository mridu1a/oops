import java.util.*;
class Sorting
{

  void swap(int a[],int x, int y) 
  {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
 }

  int partition(int a[], int lb, int hb) 
  {
    int pivot = a[lb];
    int low = lb + 1;
    int high = hb;

    while (low <= high) {
        while (low <= high && a[low] <= pivot) 
        {
            low++;
        }
        while (low <= high && a[high] > pivot) 
        {
            high--;
        }
        if (low < high) 
        {
            swap(a,low,high);
        }
    }
    swap(a,lb,high);
    return high;
}

void quicksort(int a[], int lb, int ub) 
{
    if (lb < ub) 
    {
        int pi = partition(a, lb, ub);
        quicksort(a, lb, pi - 1);
        quicksort(a, pi + 1, ub);
    }
}
}

public class QuickSort 
{ 
  public static void main(String[]args)
  {
    int i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size:");
    int n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array:");
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    s.close();
    Sorting qs=new Sorting();
    qs.quicksort(a,0,n-1);

    System.out.println("The sorted array:");
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]);
      System.out.print("\t");
    }
    System.out.println();
    
  }
  
}