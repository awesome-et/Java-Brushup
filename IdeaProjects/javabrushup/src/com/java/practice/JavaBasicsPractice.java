package com.java.practice;
import java.util.Scanner;
public class JavaBasicsPractice {
   static int oddeven;
//    static int[] intarray = { 5, 19, 7, 9, 716, 716, 17,39,19,716,716 };
    static int b = 0;
    static int[] intarray = new int[5];
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        System.out.println("Hello " + input.nextLine());

        System.out.println("Enter a number to find out if odd or even");
oddeven= input.nextInt();
if(oddeven%2==0){
    System.out.println("The number is even");
}else{
    System.out.println("The number is odd");
}

         System.out.println("Enter a number to get its multiplication table");
         int a = input.nextInt();
         System.out.println("Multiplication table for" + a);
         while (b < 10) {
             b++;
             int mul = a * b;
             System.out.println(a + "*" + b + "=" + mul);

         }


        System.out.println("Enter 5 numbers");
         for (int i=0; i< intarray.length; i++){
             intarray[i] = input.nextInt();
         }

         System.out.println("All the numbers greated than 10 are");
         for (int i = 0; i < intarray.length; i++) {
 if(intarray[i]>10){
     System.out.println(intarray[i]);
 }
         }


         System.out.println("The square of all the numbers are");
         for (int i = 0; i < intarray.length; i++) {
             System.out.println(intarray[i]*intarray[i]);
                     }

         int lnum = 0;
              System.out.println("The largest number is");
              for (int i = 0; i < intarray.length; i++) {

                 if(lnum<intarray[i]){
                     lnum=intarray[i];

         }

                 }
                 System.out.println(lnum);



                 int snum = 0;
                 System.out.println("The smallest number is");
                 for (int i = 0; i < intarray.length; i++) {
                     if(i==0){
                         snum=intarray[i];
                     }
                    if(snum>intarray[i]){
                        snum=intarray[i];

                    }
                   }
                            System.out.println(snum);

        int dupcount=0;
        System.out.println("The duplicate numbers are");
        for(int i=0; i<intarray.length;i++){
            int dup= intarray[i];
            for(int j=i+1; j<intarray.length;j++){
                if(dup==intarray[j]){

                    dupcount+=1;

                }

            }
            if(dupcount==1){
                System.out.println(dup);
            }

            dupcount=0;
        }
    }
}
