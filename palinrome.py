import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print( "Enter the  number:");
        int num=sc.nextInt();
         
         int org_num=num;
         int rem;
         int res=0;
         while(num!=0){
             rem=num%10;
          
             res=res*10+rem;
            
            num/=10  ;           
         }
         if (org_num==res){
             System.out.println(org_num+" is palindrome number ");
         }else{
               System.out.println(org_num+" is not a palindrome number ");
         }
         
         
    }
}