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
    System.out.println("Enter the amount of numbers in the list: ");
     size = scan.nextInt();
    System.out.println("\nEnter each number and press enter after inputing each number: ");

    int list[] = new int [size] ;
    for(int i= 0; i<size; i++)
    {
      list[i]= scan.nextInt();
    }
    System.out.println("\nEnter target sum: ");

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


