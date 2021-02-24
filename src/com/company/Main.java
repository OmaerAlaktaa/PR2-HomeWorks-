package com.company;

import java.util.Scanner;

public class Main {

    public static int GCD (int a,int b) //Euclidean algorithm
    {
        int n;
        while(true)
        {
            n=b%a;
            if(n==0)
                return a;
            else
                b=a;a=n;
        }
    }

    public static int max(int a, int b, int c, int d) {

        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }

    public static void main(String[] args) {
        int choies=0;
        do
            {
                Scanner myObj = new Scanner(System.in);
                System.out.println("Choose what you want to do.");
                System.out.println("1- To calculate the greatest common multiple");
                System.out.println("2- To calculate the largest number(At most 4 number)");
                System.out.println("3- To exit");
                choies = myObj.nextInt();
                if(choies==1) {
                    System.out.println("Enter tow number plz");
                    int x = myObj.nextInt();
                    int y = myObj.nextInt();
                    System.out.println("The GCD is " + GCD(x, y));
                }
                else if (choies==2) {
                    System.out.println("Enter four number plz");
                    int x1 = myObj.nextInt();
                    int x2 = myObj.nextInt();
                    int x3 = myObj.nextInt();
                    int x4 = myObj.nextInt();
                    System.out.println("The max number is " + max(x1, x2, x3, x4));
                }
                else if(choies==3) {
                    System.out.println("ty for using our app");
                    break;
                }
                else
                    System.out.println("404 Not Found");
            }
while (choies!=3);

    }
}
