import java.util.Scanner;
import java.util.Arrays;

 class Main{
     
     public static void main (String args[]){
         
         Scanner sc=new Scanner(System.in);
         
          System.out.print("Enter the arr length:");
         int number=sc.nextInt();
         int arr[]=new int[number];
         int divBy3=0 ,divBy5=0 ;
         for (int i=0 ;i<number;i++){
             arr[i]=sc.nextInt();
             if (arr[i]%a==0){
                 divBy3=divBy3+arr[i];
             }else if (arr[i]%5==0){
                 divBy5=divBy5+arr[i];
             }
         }
          
          System.out.println(Arrays.toString(arr));
          System.out.println("Sum of div by 3: "+divBy3);
          System.out.println("Sum of div by 5: "+divBy5);
         
         
     }
     
 }