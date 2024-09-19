import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print( "Enter the String:");
        
        String string=sc.nextLine();
        
         String str=string.toLowerCase();
         
         String str2="";
         int num=str.length();
         
         for (int i=num-1;i>=0;i--){
            str2=str2+str.charAt(i);
     }
        
         if (str.equals(str2)){
              
             System.out.println(str2+" is pallindrome String ");
         }else{
               
               System.out.println(str2+" is not a pallindrome String ");
         } 
          
          
         
    }
}
