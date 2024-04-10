package lec_5;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int dividend=b;
        int divisor=a;
        int reminder=-1;
        while (reminder !=0){
            reminder=dividend%divisor;
            dividend=divisor;
            divisor=reminder;

        }
        System.out.println(dividend);


    }
}
