import java.util.Scanner;

class HelloWorld {
   
   
    public static int method(int a,int b){
          return a+b;
    }
   // public static int intMethod(int x){
       // return x+5;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number a:");
    int num1=sc.nextInt();
      System.out.print("Enter the number b:");
    int num2=sc.nextInt();
      
   System.out.println("sum of values:"+method(num1,num2));
        
         //System.out.println(intMethod(17));
    }
}
