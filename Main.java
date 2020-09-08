import java.util.Scanner;
import java.io.*; 
import java.util.Vector;
import java.util.*;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    int size ;
    System.out.println("Enter the number of numbers in list: ");
     size = scan.nextInt();
    System.out.println("\nEnter list (press enter after inputting each number): ");

    int list[] = new int [size] ;
    for(int i= 0; i<size; i++)
    {
      list[i]= scan.nextInt();
    }
    System.out.println("\nEnter target value: ");

    int target = scan.nextInt();
    for(int i: list)
    {
       System.out.println(i);
    }
      System.out.println();
      numbers total = new numbers();
      System.out.println(total.combine(list,target));
  } 
}























/*import java.util.twList;

public class Numbs_List 
{ 
    static boolean[][] tw; 
    static void display(twList<Integer> v) 

    { 
       System.out.println(v); 
    } 
    // prints all subsets 

    static void printNumbs(int arr[], int i, int total,twList<Integer> p)
    { 
        if (i == 0 && total != 0 && tw[0][total]) 

        { 
            p.add(arr[i]); 
            display(p); 
            p.clear(); 
            return; 
        } 
        if (i == 0 && total == 0) 

        { 
            display(p); 
            p.clear(); 
            return; 
        } 

        if (tw[i-1][total]) //stores path
        { 
            twList<Integer> b = new twList<>(); 
            b.addAll(p); 
            printNumbs(arr, i-1, total, b); 

        } 
        if (total >= arr[i] && tw[i-1][total-arr[i]]) 
        { 
            p.add(arr[i]); 
            printNumbs(arr, i-1, total-arr[i], p); 
        } 
    } 

    static void printNumbs_all(int arr[], int n, int total) 
    { 

        if (n == 0 || total < 0) 
           return; 
        tw = new boolean[n][total + 1]; 

        for (int i=0; i<n; ++i) 
        { 
            tw[i][0] = true;   
        } 

        if (arr[0] <= total) 

           tw[0][arr[0]] = true; 

        for (int i = 1; i < n; ++i) 

            for (int j = 0; j < total + 1; ++j) 

                tw[i][j] = (arr[i] <= j) ? (tw[i-1][j] || 

                                           tw[i-1][j-arr[i]]) 

                                         : tw[i - 1][j]; 

        if (tw[n-1][total] == false) 

        { 
            System.out.println("There are no subsets with" + " total "+ total); 

            return; 

        } 
        twList<Integer> p = new twList<>(); 
        printNumbs(arr, n-1, total, p); 

    } 
    
    public static void main(String args[]) 
    { 
        int arr[] = {1, 2, 3, 4, 5}; 
        int n = arr.length; 
        int total = 10; 
        printNumbs_all(arr, n, total); 
    } 
}*/