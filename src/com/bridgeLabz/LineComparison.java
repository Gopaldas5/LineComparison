package com.bridgeLabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome Line comparison computation program on master branch ");
            int x2;
            int y1;
            int y2;
            double dist;
            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter x1 point:- ");

            int x1 = scanner.nextInt();

            System.out.println("Enter y1 point:- ");

            y1=scanner.nextInt();

            System.out.println("Enter x2point:- ");

            x2=scanner.nextInt();

            System.out.println("Enter y2 point");

            y2=scanner.nextInt();

            dist=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

            System.out.println("Distance between two point is:-  "+"("+x1+","+y1+"),"+"("+x2+","+y2+"):- "+dist);


        }
}
