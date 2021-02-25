package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;

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

    public static int max(int...a) {

        int max = a[0];
        for (int i=1;i<a.length;i++)
        {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        String in;
        int choies=0;
        JOptionPane.showMessageDialog(null,"WLC in our App");
        do
            {
                in= JOptionPane.showInputDialog(null,"Choose what you want to do."+"\n"+"1- Calculate the greatest common multiple"+"\n"+"2- Calculate the largest number(Unlimited)"+"\n"+"3- Exit"+"\n");
                choies=Integer.parseInt(in);
                if(choies==1) {
                    String in1=JOptionPane.showInputDialog("Enter the 1est number");
                            int x=Integer.parseInt(in1);
                    String in2=JOptionPane.showInputDialog("Enter the 2est number");
                    int y=Integer.parseInt(in2);
                    JOptionPane.showMessageDialog(null,"The GCD is " + GCD(x, y));
                }
                else if (choies==2) {
                    String in3=JOptionPane.showInputDialog("Enter the 1est number");
                    int x1=Integer.parseInt(in3);
                    String in4=JOptionPane.showInputDialog("Enter the 2est number");
                    int x2=Integer.parseInt(in4);
                    String in5=JOptionPane.showInputDialog("Enter the 3est number");
                    int x3=Integer.parseInt(in5);
                    String in6=JOptionPane.showInputDialog("Enter the 4est number");
                    int x4=Integer.parseInt(in6);
                    JOptionPane.showMessageDialog(null,"The max number is " + max(x1, x2, x3, x4));
                }
                else if(choies==3) {
                    JOptionPane.showMessageDialog(null,"TY for using our App");
                    break;
                }
                else
                   JOptionPane.showMessageDialog(null,"404 Not Found");
            }
while (choies!=3);

    }
}
