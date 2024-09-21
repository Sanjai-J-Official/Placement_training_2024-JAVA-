 class HelloWorld {
    public static void method(int a){
        
        int ind1=0;
        int ind2=1;
        String alpa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0;i<a;i++){
           
                String string="";
              
                string=string+ alpa.substring(ind1,ind2);
                System.out.println(string);
                ind1=ind1+i+1;
                ind2=ind2+i+2;
       
        }
 
    }
    public static void main(String[] args) {
         method(5);
    }
}
