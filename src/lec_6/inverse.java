package lec_6;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=0;
        int place=1;
        while (n!=0){
            int digit=n%10;
            ans=ans+(int)(Math.pow(10,digit-1))*place;
            n/=10;
            place=place+1;
        }
        System.out.println(ans);
    }
}
