package com.testprogram;

import java.util.Scanner;
class Probability{
 private static Scanner sc;

public static void main(String[] ards){
int a = 1;
int b = 1;
sc = new Scanner(System.in);
System.out.println("Enter the limit of the sequence:");
int n = sc.nextInt();
int c=1;
for(int i = 0; i < n; i++){
             if(i < 2)
              System.out.println(a);
             else
              {
                 c = a +b;
                if((i+1)%4 == 0)
                c *= 4;
            System.out.println(c);
               a = b;
              b = c;
           }
 
       }
}
}