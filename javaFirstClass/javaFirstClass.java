import java.util.Date;

public class javaFirstClass{
    public static void main(String [] args){
        System.out.println("OOP First Class");
         int a=10;
         int b=20;
         int sum=a+b;
         System.out.println(sum);
         String rajib="Avronil Rajib";
         System.out.println(rajib);
         for(int i=0;i<5;i++){
            System.out.println(i);
         }
         //Fibonacci Serices using for loop: 
         int ab=0;
         int ac=1;
         System.out.println("Fibonacci Serices using for loop: ");
         System.out.println(ab);
         System.out.println(ac);
         for(int i=1;i<10;i++){
              
             int fibo=ab+ac;
              System.out.println(fibo);
              ab=ac;
              ac=fibo;
         }

         //Fibonacci Serices using while loop: 
         System.out.println("Fibonacci Serices using while loop: ");
         int x=0;
         int y=1;
         System.out.println(x);
         System.out.println(y);
         int j=1;
         while(j<10){
              
             int fibo=x+y;
              System.out.println(fibo);
              x=y;
              y=fibo;
              j++;
         }
         int[] ar = {10, 20, 30, 40};
       for(int i=0;i<ar.length;i++){
             System.out.print(ar[i]+" ");
       }
       System.out.println("\n");
         float flt=2.3335f;
         double dbl=5.45454587;
         
         System.out.println(flt);
         System.out.println(dbl);

         Date Today=new Date();
         System.out.println(Today);

         String str=new String("Hello Bangladesh");
         System.out.println(str);
         System.out.println(str.contains("Hello")); //return true or false
         System.out.println(str.endsWith("desh")); //return true or false
         System.out.println(str.startsWith("Hello")); //return true or false

         
        
         
         




    }
}